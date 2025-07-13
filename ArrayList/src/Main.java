import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] ags) {

        // ArrayList = A resizable array that stores objects (not primitives directly)

        ArrayList<String> fruits = new ArrayList<>();

        // ✅ Add elements
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Lemon");
        fruits.add("Lemon");
        fruits.add("Apple");

        // ✅ Remove last element
        fruits.remove(fruits.size() - 1); // Removes the second "Apple"

        // ✅ Update an element
        fruits.set(0, "Pineapple");

        // ✅ Sort the list alphabetically
        Collections.sort(fruits);

        // ✅ Print the entire list
        System.out.println("Sorted fruits: " + fruits);

        // ✅ Get element at index
        System.out.println("First fruit: " + fruits.get(0));

        // ✅ Check if list contains an item
        if (fruits.contains("Lemon")) {
            System.out.println("We have lemons 🍋!");
        }

        // ✅ Loop through the list
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // ✅ Find the index of the first occurrence
        int index = fruits.indexOf("Lemon");
        System.out.println("Lemon found at index: " + index);

        // ✅ Count total items
        System.out.println("Total fruits: " + fruits.size());

        // ✅ Remove by value
        fruits.remove("Pear");

        // ✅ Clear the list
        fruits.clear();
        System.out.println("List after clearing: " + fruits); // []
    }
}
