public class Main {
    public static void main(String[] args) {

        Car myDreamCar = new Car();

        System.out.printf("I want %s %s, year %d and saving for the %,.2f BGN price\n", myDreamCar.make, myDreamCar.model, myDreamCar.year, myDreamCar.price);

        myDreamCar.start();

        myDreamCar.stop();
    }
}
