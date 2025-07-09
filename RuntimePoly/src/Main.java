import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Runtime polymorphism = When the method that gets executed is decided
        //                       at runtime based on the actual type of the object.

        Scanner scanner = new Scanner(System.in);

        Animal animal; // new Dog || new Cat

        System.out.print("Would you like Dog or a Cat (1=Dog, 2=Cat): ");

        int choice = scanner.nextInt();

        if(choice == 1) {
            animal = new Dog();
            System.out.println("Now you have new dog!");
            animal.speak();
        } else {
            animal = new Cat();
            System.out.println("Now you have a new Cat!");
            animal.speak();
        }

        scanner.close();
    }
}
