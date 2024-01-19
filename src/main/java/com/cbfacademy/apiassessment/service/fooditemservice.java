package com.cbfacademy.apiassessment.service;
import com.foodcatalogue.model.FoodItem;
import com.foodcatalogue.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class FoodItemService {
}  


public interface FoodItemService {
    
    FoodItem saveFoodItem(FoodItem foodItem);
    
    List<FoodItem> getAllFoodItems();
    
    FoodItem getFoodItemById(Long id);
    
    FoodItem updateFoodItem(Long id, FoodItem foodItemDetails);
    
    void deleteFoodItem(Long id);
    
    // Additional methods like calculateTotalCalories can be defined here
}
//Implement the interface

package com.foodcatalogue.service;



@Service

public class FoodItemServiceImpl implements FoodItemService {

    @Autowired
    private FoodItemRepository foodItemRepository;

    @Override
    public FoodItem saveFoodItem(FoodItem foodItem) {
        //Logic to save a food item
        return foodItemRepository.save(foodItem);
    }

    @Override
    public List<FoodItem> getAllFoodItems() {
        //Logic to get all food items
        return foodItemRepository.findAll();
    }

    @Override
    public FoodItem getFoodItemById(Long id) {
        //Logic to get a food item by id
        return foodItemRepository.findOne(id).orElseThrow() -> new ResourceNotFoundException("FoodItem", "id", id));
    }
    
    @Override
    public FoodItem updateFoodItem(Long id, FoodItem foodItemDetails) {  
        //Logic to update a food item
        return foodItemRepository.save(foodItemDetails);
    
    }

    @Override
    public void deleteFoodItem(Long id) {
        //Logic to delete a food item
        foodItemRepository.delete(id);
    
    }
    //Additional enhancements and extras such as Exception handling
    package com.foodcatalogue.service;

    import com.foodcatalogue.model.FoodItem;
    import java.util.List;
    
    public interface FoodItemService { //This define the contract interface
        
        FoodItem saveFoodItem(FoodItem foodItem); //Adds a new food item to the database
        
        List<FoodItem> getAllFoodItems();  //Retrieves all the food items from the database
        
        FoodItem getFoodItemById(Long id); 
        
        FoodItem updateFoodItem(Long id, FoodItem foodItemDetails); //Updates a food item in the database
        
        void deleteFoodItem(Long id); // Deletes a food item from the database   
    
        //Custom exceptions
        
        public FoodItem getFoodItemById(Long id) {
            return foodItemRepository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("FoodItem", "id", id));
        }
    
        //Implement additional methods like calculateTotalCalories here

}

    
    