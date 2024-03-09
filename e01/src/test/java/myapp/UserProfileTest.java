package myapp;

import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

class UserProfileTest {

    @Test
    void userIdGetterReturnsCorrectValue() {
        UserProfile userProfile = new UserProfile("user123", "user@example.com", "John Doe");
        assertEquals("user123", userProfile.getUserId(), "getUserId should return the correct userId");
    }

    @Test
    void emailGetterReturnsPresentOptionalWhenEmailIsNotNull() {
        UserProfile userProfile = new UserProfile("user123", "user@example.com", "John Doe");
        assertEquals(Optional.of("user@example.com"), userProfile.getEmail(), "getEmail should return a present Optional when email is not null");
    }

    @Test
    void emailGetterReturnsEmptyOptionalWhenEmailIsNull() {
        UserProfile userProfile = new UserProfile("user123", null, "John Doe");
        assertTrue(userProfile.getEmail().isEmpty(), "getEmail should return an empty Optional when email is null");
    }

    @Test
    void fullNameGetterReturnsPresentOptionalWhenFullNameIsNotNull() {
        UserProfile userProfile = new UserProfile("user123", "user@example.com", "John Doe");
        assertEquals(Optional.of("John Doe"), userProfile.getFullName(), "getFullName should return a present Optional when fullName is not null");
    }

    @Test
    void fullNameGetterReturnsEmptyOptionalWhenFullNameIsNull() {
        UserProfile userProfile = new UserProfile("user123", "user@example.com", null);
        assertTrue(userProfile.getFullName().isEmpty(), "getFullName should return an empty Optional when fullName is null");
    }
}
