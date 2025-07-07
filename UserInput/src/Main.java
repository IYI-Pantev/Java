import java.util.Scanner;

public class Main {
    public  static  void  main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        String message = String.format("Welcome to Java programming %s!\nAt the age of %d no worries!", name, age);
//        System.out.println(message);

        // Common issues integer before string

        System.out.print("Enter your age: ");
        // after integer or float
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("You like the color " + color + "cm²");

        scanner.close();
    }
}
