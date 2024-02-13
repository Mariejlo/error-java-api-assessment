package com.cbfacademy.foodcatalogue.subclassfooditem.repository;

import com.foodcatalogue.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Interfaces here adding stock, check whats is available, updating quantities, removing items
//Interacts with database JSOn file to ensure maintenance.
@Repository //interface is a repository component helpful for scanning and exception translation 
public interface FoodItemRepository  {
}
