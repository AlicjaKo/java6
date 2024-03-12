package myapp;

import java.util.Optional;

public class UserProfile {
    private String userId;
    private String email;
    private String fullName;

    public UserProfile(String uID, String mail, String name) {
        this.userId = uID;
        this.email = mail;
        this.fullName = name;
    }

    public String getUserId() {
        return this.userId;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(this.email);
    }

    public Optional<String> getFullName() {
        return Optional.ofNullable(this.fullName);
    }
}
