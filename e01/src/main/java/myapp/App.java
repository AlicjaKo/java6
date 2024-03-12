package myapp;

final class App {
    private App() {
        // Utility class, no instantiation required
    }

    public static void main(final String[] args) {
        UserProfileService service = new UserProfileService();

        UserProfile p1 = new UserProfile("user1", "user1@example.com", "John Doe");
        UserProfile p2 = new UserProfile("user2", null, "John Doe");
        UserProfile p3 = new UserProfile("user3", "user3@example.com", null);
        UserProfile p4 = new UserProfile("user1", null, null);

        service.addUserProfile(p1);
        service.addUserProfile(p2);
        service.addUserProfile(p3);
        service.addUserProfile(p4);

        System.out.println(retrieveAndPrintUserProfile(service, "user1"));
    }

    public static UserProfile retrieveAndPrintUserProfile(UserProfileService s, String uID) {
            
            if (s.getUserProfile(uID).isPresent()) {
            UserProfile person = s.getUserProfile(uID).get();
            String personName;
            if (person.getFullName().isPresent()) {
                personName = person.getFullName().get();
            }
            else {
                personName = "Anonymous";
            }

            String personEmail;
            if (person.getEmail().isPresent()) {
                personEmail = person.getEmail().get();
            }
            else {
                personEmail = "unknown@example.com";
            }

            UserProfile testProf = new UserProfile(uID, personEmail, personName);
            return testProf;
        }


        else {
            System.out.println("User profile not found for ID: " + uID);
            return null;
        }
    }

}
