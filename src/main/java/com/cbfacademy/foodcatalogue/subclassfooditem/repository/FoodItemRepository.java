//Interfaces here adding stock, check whats is available, updating quantities, removing items
//Interacts with database JSOn file to ensure maintenance.
package com.cbfacademy.foodcatalogue.subclassfooditem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cbfacademy.foodcatalogue.subclassfooditem.model.FoodItem;

@Repository //interface is a repository component helpful for scanning and exception translation 
public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
    // Define custom query methods here (optional)
    //E.g food items with specific name.. method is List<FoodItem> findByName(String name);
}