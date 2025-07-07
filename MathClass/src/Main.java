public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 25;

        // --- 1. Max and Min ---
        System.out.println("Max of a and b: " + Math.max(a, b));
        System.out.println("Min of a and b: " + Math.min(a, b));

        // --- 2. Absolute value ---
        int negative = -42;
        System.out.println("Absolute value: " + Math.abs(negative));

        // --- 3. Power and square root ---
        System.out.println("2 to the power of 3: " + Math.pow(2, 3)); // 8.0
        System.out.println("Square root of 64: " + Math.sqrt(64));   // 8.0

        // --- 4. Rounding ---
        double num = 5.678;
        System.out.println("Original number: " + num);
        System.out.println("Rounded: " + Math.round(num));           // 6
        System.out.println("Floor: " + Math.floor(num));             // 5.0
        System.out.println("Ceil: " + Math.ceil(num));               // 6.0

        // --- 5. Random (0.0 to <1.0) ---
        double random = Math.random(); // Always returns double between 0.0 (inclusive) and 1.0 (exclusive)
        System.out.println("Random number: " + random);

        // Example: Dice roll using Math.random()
        int dice = (int)(Math.random() * 6) + 1;
        System.out.println("Dice roll: " + dice);

        // --- 6. Trigonometry (angles in radians) ---
        double angle = Math.toRadians(30); // convert degrees to radians
        System.out.println("sin(30°): " + Math.sin(angle));
        System.out.println("cos(30°): " + Math.cos(angle));

        // --- 7. PI and E ---
        System.out.println("Value of PI: " + Math.PI);
        System.out.println("Value of E: " + Math.E);
    }
}
