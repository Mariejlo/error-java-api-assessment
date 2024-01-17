package com.cbfacademy.apiassessment.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
import com.cbfacademy.apiassessment.controller.UserController;
import com.cbfacademy.apiassessment.model.User;
@RequestMapping("/users/{userId}")// This sets the base path for all request in this controller
public class UserController {/**
 * This class handles all the requests related to the user resource
 */
public class UserController {

    /**
     * This method returns all the users
     * @return a list of all the users
     */
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        //TODO: implement this method
        return null;
    }

    /**
     * This method returns a specific user based on the userId
     * @param userId the userId of the user
     * @return the user with the given userId
     */
    @GetMapping("/users/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") Long userId) {
        //TODO: implement this method
        return null;
    }
}
 
    
    //Define methods to handle request here.

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;

//Class needed to be implemented in the controller

}
