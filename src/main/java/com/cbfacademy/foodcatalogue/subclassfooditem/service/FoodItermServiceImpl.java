package com.cbfacademy.foodcatalogue.subclassfooditem.service;

import com.cbfacademy.foodcatalogue.subclassfooditem.exception.ResourceNotFoundException;
import com.cbfacademy.foodcatalogue.subclassfooditem.model.FoodItem;
import com.cbfacademy.foodcatalogue.subclassfooditem.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service // Declare the class as a service
public class FoodItemServiceImpl implements FoodItemService {

    @Autowired // Dependency injection, it allows interaction between the application and the
               // database
    private FoodItemRepository foodItemRepository;

    @Override // Method
    public FoodItem saveFoodItem(FoodItem foodItem) {         
        // Validate foodItem before saving (optional)
        validateFoodItem(foodItem); // Ensure this method is implemented
        return foodItemRepository.save(foodItem);
    }

    @Override // Retrieves all the food items from the database
    public List<FoodItem> getAllFoodItems() {
        return foodItemRepository.findAll();
    }

    @Override
    public FoodItem getFoodItemById(Long id) {
        // Exception handling example
        return foodItemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("FoodItem", "id", id));
    }

    @Override
    @Transactional // Fetch, update and save
    public FoodItem updateFoodItem(Long id, FoodItem foodItemDetails) {
        FoodItem existingFoodItem = foodItemRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("FoodItem not found with id: " + id));

        // Transactional method example for data integrity
        // Logic to update a food item
    }

    // Update properties from foodItemDetails to existingFoodItem
    public FoodItem updateProperties(existingFoodItem, foodItemDetails);    
       return foodItemRepository.save(existingFoodItem);
    }

    @Override
    public void deleteFoodItem(Long id) {
        // Ensure proper exception handling if food item does not exist
        foodItemRepository.deleteById(id);
    }
    // Implement additional methods like calculateTotalCalories here
    // Additional enhancements and extras such as logging, input validation, error
    // messages and exception handling

    private void validateFoodItem(FoodItem foodItem) {
        // Implement your validation logic here
        // Example: Check if the food item's name is not empty, the calories are
        // positive, etc.
    }

    private void updateProperties(FoodItem existingFoodItem, FoodItem foodItemDetails) {
        // Update the necessary field from foodItemDetails to existingFoodItem
        existingFoodItem.setName(foodItemDetails.getName());
        existingFoodItem.setCalories(foodItemDetails.getCalories());
        existingFoodItem.setDescription(foodItemDetails.getDescription());
        existingFoodItem.setPrice(foodItemDetails.getPrice());
        // Add more properties if necessary
    }

    @Override //Assuming you want to sum these values; adjust the formula as needed
    public double calculateTotalCalories(List<FoodItem> foodItems) {
        return foodItems.stream()
                    .mapToDouble(FoodItem::getCalories) //Use the method from the FoodItem class
                    .sum();
                     
}

// Copy properties from foodItemDetails to existingFoodItem
// Consider using a library like MapStruct for more complex mappings
