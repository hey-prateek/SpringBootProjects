package com.example.__unitTesting.UserService;

import com.example.__unitTesting.UserEntity.User;
import com.example.__unitTesting.UserRepository.UserRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserService userService;

    @BeforeAll
    public static void beforeAllTestMethod() {
        //you can initialize the user object here instead of creating it in all methods separately, also can create a global static user object initially as null
        System.out.println("beforeAllTestMethod...........");
    }

    @BeforeEach
    public void beforeEachTestMethod() {
        System.out.println("beforeEachTestMethod...........");
    }

    @AfterEach
    public void afterEachTestMethod() {
        System.out.println("afterEachTestMethod...........");
    }

    @AfterAll
    public static void afterAllTestMethod() {
        System.out.println("afterAllTestMethod...........");
    }

    @Test
    void createUser() {

        User user = new User();
        user.setId(1001L);
        user.setName("Robin");

        when(userRepository.save(user)).thenReturn(user);

        User result = userService.createUser(user); //calling a public method

        //real testing - through assertions
        assertNotNull(result);
        assertEquals(user.getName(), result.getName()); //test pass
        assertTrue(result.getId() == 1001L);
//        Assertions.assertEquals("Jake", result.getName()); //test fail
    }

    @Test
    void testingVoidMethods() {
        User user = new User();
        user.setId(1001L);
        user.setName("Robin");
        when(userRepository.findById(1001L))
                .thenReturn(Optional.of(user));

        doNothing().when(userRepository).deleteById(1001L); //does nothing
        userService.deleteUserById(1001L); //this method returns void
        verify(userRepository, times(1)).deleteById(1001L);
    }

    //testing private method - userHasName
    @Test
    void testingPrivateMethod_userHasName() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method privateMethod = UserService.class.getDeclaredMethod("userHasName", String.class);
        privateMethod.setAccessible(true); //main line to access private method
        Boolean valid = (Boolean) privateMethod.invoke(userService, "kanye");
//        Boolean valid = (Boolean)privateMethod.invoke(userService, ""); //test will fail
        assertTrue(valid);
    }

    //testing if expected exceptions are thrown or not
    @Test
    void testExceptionsAreThrown() {
        User user = new User();
        user.setId(1001L);
//        user.setName("Robin"); //will fail - because name is not empty
        user.setName(""); //test will pass

        //expecting this exception to be thrown once this method is called
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> userService.createUser(user));

        //verifying exception message
        assertEquals("user name cannot be empty...", runtimeException.getMessage());

        //verifying if later on methods are not called
//        verify(userRepository, times(0)).save(user);

        //if we don't have product object then we can use a method "any", also except using times we can use "never"
        verify(userRepository, never()).save(any(User.class));
    }


}