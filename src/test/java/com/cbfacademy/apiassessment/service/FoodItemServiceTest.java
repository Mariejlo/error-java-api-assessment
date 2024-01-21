package com.cbfacademy.apiassessment.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.cbfacademy.apiassessment.model.FoodItem;
import com.cbfacademy.apiassessment.repository.FoodItemRepository;
import com.cbfacademy.foodcatalogue.subclassfooditem.service.FoodItemService;
@SpringBootTest
@ExtendWith(MockitoExtension.class) // Mock creation of the service talks to JUnit 
public class FoodItemServiceTest {
    
    //Test for the service
    @Mock //Mock instance implementation of the FoodItemRepository
    private FoodItemRepository foodItemRepository;

    @InjectMocks  //Creates an instance of the service
    private FoodItemService foodItemService;
    @Test //Single functionality test
    void whenSaveFoodItem_thenReturnFoodItem() {
        // Arrange
        FoodItem inputFoodItem = new FoodItem(/* parameters */);
        FoodItem savedFoodItem = new FoodItem(/* parameters */);
        when(foodItemRepository.save(any(FoodItem.class))).thenReturn(savedFoodItem);

        // Act: call the method you are testing
        FoodItem result = foodItemService.saveFoodItem(inputFoodItem);

        // Assert: checks that the results are as expected
        assertNotNull(result), "The result should not be null";
        assertEquals(savedFoodItem, result), "The result should be the same as the input";
        verify(foodItemRepository).save(any(FoodItem.class));
        verifyNoMoreInteractions(foodItemRepository);
        verifyZeroInteractions(inputFoodItem);
        verifyZeroInteractions(savedFoodItem);
        verifyZeroInteractions(foodItemService);
        verifyZeroInteractions(foodItemRepository);
       
    @Test
    void whenCalculateTotalCalories_thenReturnCorrectValue() {
        // Arrange: Create a FoodItem with known nutritional values
        FoodItem foodItem = new FoodItem();
        foodItem.setCalories(100);
        foodItem.setFats(20);
        foodItem.setProteins(30);
        foodItem.setCarbohydrates(50);
        when(foodItemRepository.save(any(FoodItem.class))).thenReturn(foodItem);

        // Act: Calculate the total calories
        double totalCalories = foodItemService.calculateTotalCalories(List.of(foodItem); 
        // Assert: checks that the calories results are as expected
        double expectedCalories = 100; // Update this with the correct calculation based on your logic
        assertEquals(expectedCalories, totalCalories, "The calculated total calories should match the expected value");
    }

        assertNotNull(totalCalories), "The result should not be null";
        assertEquals(100 * 4 + 20 * 9 + 30 * 4 + 50 * 4, totalCalories), "The result should be the same as the input";

        
        // Additional assertions as needed
        // Add more test methods for getAllFoodItems, getFoodItemById, updateFoodItem, deleteFoodItem, calculateTotalCalories, etc.
}
    // Template for testing getAllFoodItems
    @Test
    void whenGetAllFoodItems_thenReturnFoodItemList() {
        // Arrange: Create a list of FoodItems and set the repository to return this list when findAll is called
        List<FoodItem> foodItemList = Arrays.asList(new FoodItem(/* parameters */), new FoodItem(/* parameters */));
        when(foodItemRepository.findAll()).thenReturn(foodItemList);

        // Act: Call the method under test
        List<FoodItem> result = foodItemService.getAllFoodItems();

        // Assert: Check that the returned list matches the mock list
        assertNotNull(result, "The returned food item list should not be null");
        assertEquals(foodItemList, result, "The returned food item list should match the mock list");
    }
            
        
}
        

