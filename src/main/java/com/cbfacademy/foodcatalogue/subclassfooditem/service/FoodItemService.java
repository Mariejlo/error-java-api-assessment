package com.cbfacademy.foodcatalogue.subclassfooditem.service;

import com.cbfacademy.foodcatalogue.subclassfooditem.model.FoodItem;
import java.util.List;

/**
 * Service interface for managing FoodItems.
 * This interface defines the contract for FoodItem-related operations.
 */
public interface FoodItemService {
    
    // Adds a new FoodItem to the database
    FoodItem saveFoodItem(FoodItem foodItem);
    
    // Retrieves all FoodItems from the database
    List<FoodItem> getAllFoodItems();
    
    // Retrieves a FoodItem by its ID
    FoodItem getFoodItemById(Long id);
    
    // Updates a FoodItem in the database
    FoodItem updateFoodItem(Long id, FoodItem foodItemDetails);
    
    // Deletes a FoodItem from the database by its ID
    void deleteFoodItem(Long id);
    
    // Additional methods like calculateTotalCalories can be defined here
    // Define the signature of the calculateTotalCalories method
    double calculateTotalCalories(List<FoodItem> foodItems);'
  
}
     






    
    