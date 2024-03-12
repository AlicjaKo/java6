package myapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserProfileService {
    private Map<String, UserProfile> userProfiles = new HashMap<>();

    public UserProfileService() {
        this.userProfiles = new HashMap<>();
    }

    public void addUserProfile(UserProfile uProfile) {
        userProfiles.put(uProfile.getUserId(), uProfile);
    }

    public Optional<UserProfile> getUserProfile(String uID) {
        return Optional.ofNullable(userProfiles.get(uID));
    }
}
