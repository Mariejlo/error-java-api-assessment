    package com.cbfacademy.foodcatalogue.subclassfooditem.model;
    
    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
    import javax.persistence.Id;
    import javax.persistence.Column;
    import javax.validation.constraints.NotNull;
    import javax.validation.constraints.Size;
 /**
* Represents a specific food item in the catalogue.
*/
public class FoodItem extends FoodCatalogue {
   // FoodItem specific attributes, constructors, methods

   public FoodItem() {
       // Constructor code
   }
    
    @Entity
    public class FoodItem {
    
   
        }
        @Id 
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;  //Unique identifier for each food item (check if private is needed?) 


        @NotNull(message = "Name cannot be null") //Ensures field not null
        @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters") // Filed size within range        private String name;
        @Column(name = "food_name", nullable = false, length = 100)
        private String name;  //Name of the food item
    
        @NotNull(message = "Serving size cannot be null")
        private String servingSize; //Describes the serving size of the food (e.g.,"100g","1 cup")

        @NotNull(message = "Calories per serving cannot be null")
        private Integer caloriesPerServing;   // Number of calories per serving (e.g. 100, 1000)
           //If we got extra time more attributes like price, category will be added 
           
        public FoodItem() {
            //No argument constructor
        }
           // Constructor with all the attributes
        public FoodItem(Long id, String name, String servingSize, Integer caloriesPerServing) {
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
