public class Main {
    public static void main(String[] args) {

        // If statement
        int age = 20;

        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        // If-else statement
        boolean isLoggedIn = false;

        if (isLoggedIn) {
            System.out.println("Welcome back!");
        } else {
            System.out.println("Please log in.");
        }

        // If-else if-else chain
        int score = 85;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // Comparing two numbers
        int x = 10;
        int y = 20;

        if (x > y) {
            System.out.println("x is greater than y");
        } else if (x < y) {
            System.out.println("x is less than y");
        } else {
            System.out.println("x and y are equal");
        }
    }
}
