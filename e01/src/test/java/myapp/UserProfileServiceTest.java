package myapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

class UserProfileServiceTest {

    private UserProfileService userProfileService;

    @BeforeEach
    void setUp() {
        userProfileService = new UserProfileService();
    }

    @Test
    void testAddAndRetrieveUserProfile() {
        String userId = "user123";
        UserProfile userProfile = new UserProfile(userId, "user123@example.com", "John Doe");
        userProfileService.addUserProfile(userProfile);

        Optional<UserProfile> retrievedProfile = userProfileService.getUserProfile(userId);
        assertTrue(retrievedProfile.isPresent(), "The user profile should exist");
        retrievedProfile.ifPresent(profile -> {
            assertEquals(userId, profile.getUserId(), "User ID should match");
            assertEquals("user123@example.com", profile.getEmail().orElse(""), "Email should match");
            assertEquals("John Doe", profile.getFullName().orElse(""), "Full name should match");
        });
    }

    @Test
    void testRetrieveNonExistingUserProfile() {
        String nonExistingUserId = "nonExistingUser";
        Optional<UserProfile> retrievedProfile = userProfileService.getUserProfile(nonExistingUserId);
        assertTrue(retrievedProfile.isEmpty(), "The user profile should not exist");
    }
}
