package com.cbfacademy.apiassessment.controller;

public class FoodItemController {

    }
}
//Handles all customer interactions 
//Needs Attributes, Methods, and Constructor (check PascalCase name convention)
//Optional classes NutritionInfo.java and FoodCategory.java
//Remember each class single responsibility!
package com.foodcatalogue.controller; 

import com.foodcatalogue.model.FoodItem;

import com.foodcatalogue.service.FoodItemService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Controller class every method written HTTP response body
@RequestMapping("/api/v1/foodItems") //Set the base path for all methods

public class FoodItemController {
    @Autowired
    private FoodItemService foodItemService;
}
    @GetMapping("/{id}") //Fetches all the food items from the database 
    public List<FoodItem> getAllFoodItems() { 
        return foodItemService.getAllFoodItems();
    }
    @GetMapping("/{id}") //Fetches a specific food item/single responsibility by ID
    public ResponseEntity<FoodItem> getFoodItemById(@PathVariable("id") Long id) {  //Path variable is a method parameter bound to URI template variable
        FoodItem foodItem = foodItemService.getFoodItemById(id); 
        return ResponseEntity.ok().body(foodItem);
    }
    @PostMapping //Creates a new food item
    public ResponseEntity<FoodItem> createFoodItem(@RequestBody FoodItem foodItem) {  //Method parameter bound to body of the web request
        FoodItem savedFoodItem = foodItemService.saveFoodItem(foodItem); 
        return ResponseEntity.ok().body(savedFoodItem);
    }

    @PutMapping("/{id}") //Updates a specific food item with new details
    public ResponseEntity<FoodItem> updateFoodItem(@RequestBodyPathVariable("id") Long id, @RequestBody FoodItem foodItemDetails) {
        FoodItem updatedFoodItem = foodItemService.updateFoodItem(id, foodItemDetails); 
        return ResponseEntity.ok().body(updatedFoodItem); 
    } 
    @DeleteMapping("/{id}") //Deletes
    public ResponseEntity<FoodItem> deleteFoodItem(@PathVariable("id") Long id) {
        foodItemService.deleteFoodItem(id); 
        return ResponseEntity.noContent().build();
    } 
    
    //Additional methods can be defined here input validation, exception handling, custom success message or status codes

}
     
    

        