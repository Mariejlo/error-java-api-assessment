package com.cbfacademy.apiassessment.model;

import org.springframework.stereotype.Indexed;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity 
public class foodItem {
    public static void main(String[] args) {
       @Id 
       @GeneratedValue(strategy = GenerationType.AUTO)
       Long id; //Unique identifier for each food item (check if private is needed?) 
       String name; //Name of the food item
       String servingSize; //Describes the serving size of the food (e.g.,"100g","1 cup")
       Integer caloriesPerServing; // Number of calories per serving (e.g. 100, 1000)
       //If we got extra time more attributes like price, category will be added 
       
    public FoodItem() {
        //No argument constructor
    }
    public FoodItem(Long id, String name, String servingSize, Integer caloriesPerServing) {
        // Constructor with all the attributes
        this.id = id;
        this.name = name;
        this.servingSize = servingSize;
        this.caloriesPerServing = caloriesPerServing;
    }
    
    //Getters and setters for all attributes

    @Override
    public String toString() {
        String servingSize;
        String caloriesPerServing;
        String id;
        String name;
        return "FoodItem{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", servingSize='" + servingSize + '\'' +
               ", caloriesPerServing=" + caloriesPerServing +
               '}';

    }

}  
