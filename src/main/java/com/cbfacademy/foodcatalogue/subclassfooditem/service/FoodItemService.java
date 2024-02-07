package com.cbfacademy.foodcatalogue.subclassfooditem.service;

import java.util.List;

import com.cbfacademy.foodcatalogue.subclassfooditem.model.FoodItem2;

public interface FoodItemService { // This define the contract interface

    FoodItem2 saveFoodItem(FoodItem2 foodItem); // Adds a new food item to the database

    List<FoodItem2> getAllFoodItems(); // Retrieves all the food items from the database

    FoodItem2 getFoodItemById(Long id);

    FoodItem2 updateFoodItem(Long id, FoodItem2 foodItemDetails); // Updates a food item in the database

    void deleteFoodItem(Long id); // Deletes a food item from the database

    // Implement additional methods like calculateTotalCalories here

}
