public class Car {

    //Attributes

    String make = "Ford";
    String model = "Mustang";
    int year  = 2025;
    double price = 117_000;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("Mustang's Dark Horse engine started!");
    }

    void stop() {
        isRunning = false;
        System.out.println("Mustang's engine stopped.");
    }
}
