import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid data! You need to enter a number.");
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Program ends***");
        }

        scanner.close();
    }
}
