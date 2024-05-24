package com.example.taskmanager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class UserLoginTest {
    @Test
    public void testUserLogin() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.register("user1", "password1");
        UserLogin userLogin = new UserLogin(userRegistration);
        assertTrue(userLogin.login("user1", "password1"));
        assertFalse(userLogin.login("user1", "wrongpassword"));
    }
}