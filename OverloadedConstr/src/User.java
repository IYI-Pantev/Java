public class User {

    String username;
    String email;
    int age;

    User(String username) {
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }

    User(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }
}
