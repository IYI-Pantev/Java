public class Main {
    public static void main(String[] args) {

        // .toString() = Method ingerited from the Object class.
        //               Used to return a string representation of an object
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details.


        Car myCar = new Car("BMW", "X5", 2023, "Metallic");

        System.out.println(myCar);
    }
}
