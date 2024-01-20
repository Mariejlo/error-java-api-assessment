package com.cbfacademy.apiassessment.service;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ExtendWith(MockitoExtension.class) // Mock creation of the service talks to Junit 
public class FoodItemServiceTest {
    
    //Test for the service
    @Mock //Mock implementation of the repository
    private FoodItemRepository foodItemRepository;

    @InjectMocks  //Creates an instance of the service
    private FoodItemService foodItemService;

    @Test //Single functionality test
    void whenSaveFoodItem_thenReturnFoodItem() {
        // Arrange
        FoodItem inputFoodItem = new FoodItem(/* parameters */);
        FoodItem savedFoodItem = new FoodItem(/* parameters */);
        when(foodItemRepository.save(any(FoodItem.class))).thenReturn(savedFoodItem);

        // Act: call the method you are testing
        FoodItem result = foodItemService.saveFoodItem(inputFoodItem);

        // Assert: checks that the results are as expected
        assertNotNull(result);
        assertEquals(savedFoodItem, result);
        // Additional assertions as needed
        
    }
        




}


