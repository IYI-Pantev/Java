public class Main {

    public static void main(String[] args) {

        // Array of objects

        Car car1 = new Car("Ford", "Blue");
        Car car2 = new Car("BMW", "Metallic");
        Car car3 = new Car("Porsche", "Red");

        Car[] cars = {car1, car2, car3};

        // Array of anonymous Car objects
//        Car[] cars = {
//                new Car("Ford", "Blue"),
//                new Car("BMW", "Metallic"),
//                new Car("Porsche", "Red")
//        };

        for(Car car : cars) {
            car.drive();
        }

    }
}
