package course.se.taskmanager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class UserRegistrationTest {
    @Test
    public void testUserRegistration() {
        UserRegistration userRegistration = new UserRegistration();
        assertTrue(userRegistration.register("user1", "password1"));
        assertFalse(userRegistration.register("user1", "password1")); // ⽤户
        已存在
    }
    @Test
    public void testUserLogin() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.register("user1", "password1");
        assertTrue(userRegistration.login("user1", "password1"));
        assertFalse(userRegistration.login("user1", "wrongpassword"));
    }
