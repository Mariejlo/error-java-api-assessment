package com.cbfacademy.apiassessment.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserController {
    

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
