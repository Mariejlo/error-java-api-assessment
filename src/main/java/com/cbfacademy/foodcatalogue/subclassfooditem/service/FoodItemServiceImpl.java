package com.cbfacademy.foodcatalogue.subclassfooditem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cbfacademy.foodcatalogue.subclassfooditem.exception.ResourceNotFoundException;
import com.cbfacademy.foodcatalogue.subclassfooditem.model.FoodItem2;
import com.cbfacademy.foodcatalogue.subclassfooditem.repository.FoodItemRepository;

import java.util.List;

import javax.persistence.EntityNotFoundException;

@Service // Declare the class as a service
public class FoodItemServiceImpl implements FoodItemService {

    @Autowired // Dependency injection, it allows interaction between the application and the
               // database
    private FoodItemRepository foodItemRepository;

    @Override // Method
    public FoodItem2 saveFoodItem(FoodItem2 foodItem) {
        // Validate foodItem before saving (optional)
        // Save the new FoodItem to the database
        return foodItemRepository.save(foodItem);
    }

    @Override // Retrieves all the food items from the database
    public List<FoodItem2> getAllFoodItems() {
        return foodItemRepository.findAll();
    }

    @Override
    public FoodItem2 getFoodItemById(Long id) {
        // Exception handling example
        return foodItemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("FoodItem", "id", id));
    }

    @Override
    @Transactional // Fetch, update and save
    public FoodItem2 updateFoodItem(Long id, FoodItem2 foodItemDetails) {
        FoodItem2 existingFoodItem = foodItemRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("FoodItem not found with id: " + id));

        existingFoodItem.setName(foodItemDetails.getName());
        existingFoodItem.setCalories(foodItemDetails.getCalories());
        existingFoodItem.setServingSize(foodItemDetails.getServingSize());

        return foodItemRepository.save(existingFoodItem);
        // Transactional method example for data integrity
        // Logic to update a food item
    }

    @Override
    public void deleteFoodItem(Long id) {
        foodItemRepository.deleteById(id);
    }

    // Implement additional methods like calculateTotalCalories here
    // Additional enhancements and extras such as logging, input validation, error
    // messages and exception handling
}
