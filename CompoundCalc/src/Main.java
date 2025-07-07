import java.util.Scanner;


public class Main {
    public  static void main(String[] args) {

        // Compound calculator

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompound;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per years: ");
        timesCompound = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompound, timesCompound * years);

        System.out.printf("The amount after %d years is €%,.2f\n", years, amount);

        scanner.close();
    }
}
