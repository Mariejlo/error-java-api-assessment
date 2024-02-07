
package com.cbfacademy.foodcatalogue.subclassfooditem.controller;

//Handles all customer interactions 
//Needs Attributes, Methods, and Constructor (check PascalCase name convention)
//Optional classes NutritionInfo.java and FoodCategory.java
//Remember each class single responsibility!

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.cbfacademy.foodcatalogue.subclassfooditem.model.FoodItem2;
import com.cbfacademy.foodcatalogue.subclassfooditem.service.FoodItemService;

import jakarta.validation.Valid;

import java.util.List;

@RestController // Controller class every method written HTTP response body
@RequestMapping("/api/v1/foodItems") // Set the base path for all methods
@Validated // FoodItem are automatically validated when they are received as input
public class FoodItemController {

    @Autowired
    private FoodItemService foodItemService;

    @GetMapping
    List<FoodItem2> getAllFoodItems() { // Fetches all the food items from the database (REVISION NEEDED)

        return foodItemService.getAllFoodItems();
    }

    @GetMapping("/{id}") // Fetches a specific food item/single responsibility by ID
    public ResponseEntity<FoodItem2> getFoodItemById(@PathVariable("id") Long id) { // Path variable is a method
                                                                                   // parameter bound to URI template
                                                                                   // variable
        FoodItem2 foodItem = foodItemService.getFoodItemById(id);
        return ResponseEntity.ok().body(foodItem);
    }

    @PostMapping // Createa a new food item with validation
    public ResponseEntity<FoodItem2> createFoodItem(@Valid @RequestBody FoodItem2 foodItem) { // @Valid if validation
                                                                                            // fails , Spring return 400
                                                                                            // bad request response
        FoodItem2 savedFoodItem = foodItemService.saveFoodItem(foodItem); // Method parameter bound to body of the web
                                                                         // request
        return ResponseEntity.ok().body(savedFoodItem);
    }

    @PutMapping("/{id}") // Updates a specific food item with new details
    public ResponseEntity<FoodItem2> updateFoodItem(@PathVariable("id") Long id,
            @RequestBody FoodItem2 foodItemDetails) {
        FoodItem2 updatedFoodItem = foodItemService.updateFoodItem(id, foodItemDetails);
        return ResponseEntity.ok().body(updatedFoodItem);
    }

    @DeleteMapping("/{id}") // Deletes
    public ResponseEntity<FoodItem2> deleteFoodItem(@PathVariable("id") Long id) {
        foodItemService.deleteFoodItem(id);
        return ResponseEntity.noContent().build();
    }

    // Additional methods can be defined here input validation, exception handling,
    // custom success message or status codes

}
