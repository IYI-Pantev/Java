public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // --- 1. Equality and Inequality (for primitives) ---
        System.out.println("a == b: " + (a == b));   // false
        System.out.println("a != b: " + (a != b));   // true

        // --- 2. Greater and Less Than ---
        System.out.println("a > b: " + (a > b));     // false
        System.out.println("a < b: " + (a < b));     // true
        System.out.println("a >= 10: " + (a >= 10)); // true
        System.out.println("b <= 15: " + (b <= 15)); // false

        // --- 3. Comparison with booleans ---
        boolean isActive = true;
        System.out.println("isActive == true: " + (isActive == true)); // true
        System.out.println("!isActive: " + (!isActive));               // false

        // --- 4. Comparison with Strings (important!) ---
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        // ⚠️ Don't use == to compare strings! It checks reference!
        System.out.println("s1 == s2: " + (s1 == s2));       // true (same interned string)
        System.out.println("s1 == s3: " + (s1 == s3));       // false (different object)
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // ✅ true (content comparison)

        // --- 5. Using equalsIgnoreCase (case-insensitive) ---
        String name = "Nick";
        System.out.println("name.equals(\"Nick\"): " + name.equals("Nick"));              // true
        System.out.println("name.equals(\"nick\"): " + name.equals("nick"));              // false
        System.out.println("name.equalsIgnoreCase(\"nick\"): " + name.equalsIgnoreCase("nick")); // true

        // --- 6. Logical Operators in Comparisons ---
        int age = 25;
        boolean isMember = true;

        // AND (&&) operator
        if (age >= 18 && isMember) {
            System.out.println("Access granted.");
        }

        // OR (||) operator
        if (age < 18 || isMember) {
            System.out.println("Partial access granted.");
        }

        // NOT (!) operator
        if (!isMember) {
            System.out.println("You must be a member.");
        } else {
            System.out.println("Membership confirmed.");
        }

        // --- 7. Nested Comparisons ---
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

    }
}
