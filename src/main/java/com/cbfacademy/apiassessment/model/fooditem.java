package com.cbfacademy.apiassessment.model;

public class foodItem {
    public static void main(String[] args) {
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
        return "FoodItem{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", servingSize='" + servingSize + '\'' +
               ", caloriesPerServing=" + caloriesPerServing +
               '}';

    }

}  
