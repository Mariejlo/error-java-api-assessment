package com.cbfacademy.foodcatalogue.subclassfooditem.service;

import com.cbfacademy.foodcatalogue.subclassfooditem.exception.ResourceNotFoundException;
import com.cbfacademy.foodcatalogue.subclassfooditem.model.FoodItem;
import com.cbfacademy.foodcatalogue.subclassfooditem.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException; 
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
        return foodItemRepository.saveFoodItem(foodItem);
    }

    @Override // Retrieves all the food items from the database
    public List<FoodItem> getAllFoodItems() {
        return foodItemRepository.getAllFoodItems();
    }

    @Override
    public FoodItem getFoodItemById(Long id) {
        // Exception handling example
        return foodItemRepository.getFoodItemById(id)
                .orElseThrow(() -> new ResourceNotFoundException("FoodItem", "id", id));
    }

    @Override
    @Transactional // Fetch, update and save
    public FoodItem updateFoodItem(Long id, FoodItem foodItemDetails) {
        FoodItem existingFoodItem = foodItemRepository.getFoodItemById(id)
                .orElseThrow(() -> new EntityNotFoundException("FoodItem not found with id: " + id));

        // Transactional method example for data integrity
        // Logic to update a food item
        // Call the method to update properties
        existingFoodItem.setDescription(foodItemDetails.getDescription());
        existingFoodItem.setPrice(foodItemDetails.getPrice());
        return foodItemRepository.save(existingFoodItem); // Return the updated food item
    }

    private void validateFoodItem(FoodItem foodItem) {
        // Implement your validation logic here
        // Example: Check if the food item's name is not empty, the calories are
        // positive, etc.
        if(foodItem.getName() == null || foodItem.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Food item name cannot be empty");
        }
        if(foodItem.getCalories() < 0) {
            throw new IllegalArgumentException("Calories cannot be negative");
        }
        // Add more validations as necessary
    }
   
    @Override
    public void deleteFoodItem(Long id) {
        foodItemRepository.deleteFoodItem(id);
    }     
    
    @Override //Assuming you want to sum these values; adjust the formula as needed
    public double calculateTotalCalories(List<FoodItem> foodItems) {
        return foodItems.stream()
                    .mapToDouble(FoodItem::getCalories) //Use the method from the FoodItem class
                    .sum();
    }
                     
}

// Copy properties from foodItemDetails to existingFoodItem
// Consider using a library like MapStruct for more complex mappings
