package com.cbfacademy.apiassessment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Description;
import org.springframework.http.ResponseEntity;

import com.cbfacademy.App;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
		 * This class tests the functionalities of the FoodItem model,
		 * especially the calculateTotalCalories method.
		 */
        public class FoodItemTest {
		
            @Test
            public void testCalculateTotalCalories() {
                // Arrange
                FoodItem foodItem = new FoodItem();
                foodItem.setCarbohydrates(10);
                foodItem.setProteins(10);
                foodItem.setFats(10);
                foodItem.setSugars(10);
                System.out.println(foodItem);
                System.out.println(foodItem.calculateTotalCalories());
    
                // Act
                double actualCalories = foodItem.calculateTotalCalories();
                System.out.println(actualCalories);
    
                // Assert
                double expectedCalories = (10 * 4) + (10 * 4) + (10 * 9);
                assertEquals(expectedCalories, foodItem.calculateTotalCalories());
                // ... add more test cases...
    
            }
    
        }
    
    }
