import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Jumu doggo = new Jumu();
        doggo.dogSay();

        // --- 1. Declare and initialize an array ---
        String[] fruits = {"apple", "orange", "banana"};

        // --- 2. Access elements by index (0-based) ---
        System.out.println("Second fruit: " + fruits[1]); // orange

        // --- 3. Update an element ---
        fruits[2] = "pineapple"; // replaces "banana"
        System.out.println("Updated third fruit: " + fruits[2]);

        // --- 4. Get the array length ---
        System.out.println("Total fruits: " + fruits.length);

        // --- 5. Loop through the array (classic for loop) ---
        System.out.println("All fruits (index-based):");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("- " + fruits[i]);
        }

        // --- 6. Loop through with enhanced for-loop (like JS for-of) ---
        System.out.println("All fruits (for-each loop):");
        for (String fruit : fruits) {
            System.out.println("🍉 " + fruit);
        }

        // --- 7. Convert array to String for easy printing ---
        System.out.println("Array as string: " + Arrays.toString(fruits));

        // --- 8. Sort the array alphabetically ---
        Arrays.sort(fruits);
        System.out.println("Sorted fruits: " + Arrays.toString(fruits));

        // --- 9. Search (manually or with helper logic) ---
        String search = "apple";
        boolean found = false;
        for (String fruit : fruits) {
            if (fruit.equals(search)) {
                found = true;
                break;
            }
        }
        System.out.println("Is 'apple' in the list? " + (found ? "✅ Yes" : "❌ No"));

        // --- 10. Create an array with fixed size and assign values later ---
        int[] numbers = new int[3]; // array of 3 ints (default 0)
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        System.out.println("Numbers: " + Arrays.toString(numbers));
    }
}
