package com.cbfacademy.apiassessment.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/users/{userId}")// This sets the base path for all request in this controller
public class UserController {
 
    
    //Define methods to handle request here.

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

class UserControllerTest {

 
   * /**
    * Tests the getUser method in the UserController class.
    */
   @Test
   public void testGetUser() {
       // Arrange
       UserController controller = new UserController();
   
       // Act
       User user = controller.getUser(1);
   
       // Assert
       assertEquals("User info for user1", user);
   
  }
}

}
