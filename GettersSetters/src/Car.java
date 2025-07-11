public class Car {

    // ✅ Private fields (encapsulation)
    private String model;
    private String color;
    private int price;

    // ✅ Constructor
    public Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        setPrice(price); // Use setter for validation
    }

    // ✅ Getter for model (READ)
    public String getModel() {
        return model;
    }

    // ✅ Setter for model (WRITE)
    public void setModel(String model) {
        this.model = model;
    }

    // ✅ Getter for color
    public String getColor() {
        return color;
    }

    // ✅ Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // ✅ Getter for price
    public int getPrice() {
        return price;
    }

    // ✅ Setter with validation
    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price must be non-negative.");
        }
    }
}
