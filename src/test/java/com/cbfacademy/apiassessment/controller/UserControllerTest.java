package com.cbfacademy.apiassessment.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import com.cbfacademy.apiassessment.App;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = App.class)
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetUserById() throws Exception {
        mockMvc.perform(get("/users/12345")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("User ID is: 12345")); // Make sure your controller is returning this exact string or adjust the test accordingly
    }

    // ... other test methods for UserController ...
}

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
   
       class UserControllerTest {

        import org.junit.jupiter.api.Test;
    import org.springframework.boot.test.context.SpringBootTest;
    import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
    import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
    
    @SpringBootTest
    class ApiAssessmentApplicationTests {
    
        /**
     * This class contains unit tests for the UserController class.
     */
    @SpringBootTest
    class ApiAssessmentApplicationTests {
    
        /**
         * This method is used to test the context loading.
         */
        @Test
        void contextLoads() {
        }
    
        /**
         * This method is used to test the GET request for a user by ID.
         *
         * @throws Exception if the request fails
         */
        @Test
        public void testGetUserById() throws Exception {
            mockMvc.perform(get("/users/12345")
                    .accept(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(content().string("User ID is: 12345"));
        }
    }
    
        /**
     * This method is used to test the GET request for a user by ID.
     *
     * @throws Exception if the request fails
     */
    @Test
    public void testGetUserById() throws Exception {
        mockMvc.perform(get("/users/12345")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("User ID is: 12345"));
    }
    }
    }
    
}
