public class Main {
    public static void main(String[] args) {

        // Polymorphism = Objects can be treated as objects of a common superclass.
        //                It can also be done with Interfaces.

        Vehicle[] vehicles = {new Car(), new Bike(), new Boat()};

        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
