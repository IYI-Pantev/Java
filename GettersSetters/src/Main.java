public class Main {
    public static void main(String[] args) {
        // Getters = Make a field READABLE
        // Setters = Make a field WRITEABLE
        // ✅ They protect object data and allow validation logic

        Car car = new Car("BMW", "Blue", 70_000);

        // Use getters to read values
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Price: " + car.getPrice() + " BGN");

        // Use setters to change values
        car.setPrice(75_000); // ✅ Update with valid value
        car.setColor("Metallic Gray");
        car.setPrice(-5000); // ❌ Triggers validation message

        // Show updated state
        System.out.println("\nUpdated Car Info:");
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Price: " + car.getPrice() + " BGN");
    }
}
