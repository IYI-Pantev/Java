import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int number;

        System.out.print("Guess dice number: ");
        guess = scanner.nextInt();
        number = random.nextInt(1, 7);

        if (guess < 1 || guess > 6) {
            System.out.println("Invalid guess! Please enter a number between 1 and 6.");
        } else if (guess == number) {
            System.out.println("Bravo!🎉 Your guess was " + guess + " and dice showed " + number);
        } else {
            System.out.println("No luck this time... 😔 Your guess was " + guess + " and dice showed " + number);
        }


        scanner.close();
    }
}
