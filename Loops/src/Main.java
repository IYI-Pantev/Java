import java.util.Scanner;
import  java.util.Random;

public class Main {
    public static void main(String[] args) {

        // while loop
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String response = "";

        while(true) {
            System.out.print("Guess a number (1-6) or press q to quite: ");
            response = scanner.nextLine();

            if (response.trim().isEmpty()) {
                System.out.println("Please type a number 1–6 or 'q' to quit.");
                continue;
            }

            if (response.equalsIgnoreCase("q")) {
                System.out.println("Goodbye! 🎲");
                break;
            }

            try {
                int guess = Integer.parseInt(response);

                if (guess < 1 || guess > 6) {
                    System.out.println("Please enter a number between 1 and 6.");
                    continue; // restart loop
                }

                int dice = random.nextInt(1, 7); // 1–6

                if (guess == dice) {
                    System.out.println("🎉 Correct! The dice rolled: " + dice);
                } else {
                    System.out.println("❌ Nope! You guessed " + guess + ", dice rolled: " + dice);
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1–6 or Q to quit.");
            }


        }


        scanner.close();
    }
}
