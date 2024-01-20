package com.cbfacademy.apiassessment.service;

public class FoodItemServiceImpl implements FoodItemService {

}
    
package com.cbfacademy.foodcatalogue.subclassfooditem.service;

import com.foodcatalogue.model.FoodItem;
import com.foodcatalogue.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service //Declare the class as a service
public class FoodItemServiceImpl implements FoodItemService {
    
    @Autowired //Dependency injection, it allows interaction between the application and the database
    private FoodItemRepository foodItemRepository;

    @Override //Method 
    public FoodItem saveFoodItem(FoodItem foodItem) {
        // Validate foodItem before saving (optional)
        // Save the new FoodItem to the database
        return foodItemRepository.save(foodItem);
    }

    @Override //Retrieves all the food items from the database
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
    @Transactional //Fetch, update and save 
    public FoodItem updateFoodItem(Long id, FoodItem foodItemDetails) {
        FoodItem existingFoodItem = foodItemRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("FoodItem not found with id: " + id));

        existingFoodItem.setName(foodItemDetails.getName());
        existingFoodItem.setCalories(foodItemDetails.getCalories());
        existingFoodItem.setDescription(foodItemDetails.getDescription());
        existingFoodItem.setPrice(foodItemDetails.getPrice());
        return foodItemRepository.save(existingFoodItem);
        // Transactional method example for data integrity
        // Logic to update a food item
    }

    @Override
    public void deleteFoodItem(Long id) {
        foodItemRepository.deleteById(id);
    }
    
    // Implement additional methods like calculateTotalCalories here
    // Additional enhancements and extras such as logging, input validation, error messages and exception handling
}
