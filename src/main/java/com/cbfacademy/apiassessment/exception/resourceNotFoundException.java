package com.cbfacademy.apiassessment.exception;

public class resourceNotFoundException {
    
}
package com.foodcatalogue.exception;

public class ResourceNotFoundException extends RuntimeException {  //Unchecked exception

    public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
    }
    
    // You can add more constructors or methods if needed
}
