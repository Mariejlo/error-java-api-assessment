package com.cbfacademy.foodcatalogue.subclassfooditem.repository;

import com.foodcatalogue.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Interfaces here adding stock, check whats is available, updating quantities, removing items
//Interacts with database JSOn file to ensure maintenance.
@Repository //interface is a repository component helpful for scanning and exception translation 
public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
    // Define custom query methods here (optional)
    List<FoodItem> findByName(String name);
    List<FoodItem> findByCategory(String category);
    List<FoodItem> findByCategoryAndName(String category, String name);

    //E.g food items with specific name.. method is List<FoodItem> findByName(String name);
    //// If you need to perform a complex query that involves multiple tables or custom conditions,
    // you might need to use @Query annotation or define a custom method implementation.
    
    // Example: Update the stock for a specific food item
    // This is a bit more complex because it involves writing a custom method implementation or using a query.
    // @Modifying
    // @Query("update FoodItem f set f.stock = :stock where f.id = :id")
    // void updateStock(@Param("id") Long id, @Param("stock") int stock);
}
