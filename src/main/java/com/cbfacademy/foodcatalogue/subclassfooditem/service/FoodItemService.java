package com.cbfacademy.foodcatalogue.subclassfooditem.service;

import java.util.List;

import com.cbfacademy.foodcatalogue.subclassfooditem.model.FoodItem;

public interface FoodItemService { // This define the contract interface

    FoodItem saveFoodItem(FoodItem foodItem); // Adds a new food item to the database

    List<FoodItem> getAllFoodItems(); // Retrieves all the food items from the database

    FoodItem getFoodItemById(Long id);

    FoodItem updateFoodItem(Long id, FoodItem foodItemDetails); // Updates a food item in the database

    void deleteFoodItem(Long id); // Deletes a food item from the database

    // Implement additional methods like calculateTotalCalories here

}
