
public class UserFactory {

    static User create(String type) {
        switch (type.toLowerCase()) {
            case "student":
                return new Student();
            case "faculty":
                return new Faculty();
            case "librarian":
                return new Librarian();
            default:
                throw new IllegalArgumentException("Invalid user");
        }
    }
}
