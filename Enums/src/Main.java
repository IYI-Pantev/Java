public class Main {
    public static void main(String[] args) {

        // Enums = (Enumerations) A special kind of class that
        //         represents a fixed set of constants.
        //         They improve code readability and are easy to maintain.
        //         More efficient with switches when comparing Strings.

        // ✅ Basic assignment
        Day today = Day.FRIDAY;
        System.out.println("Today is: " + today);

        // ✅ Getting associated value (day number)
        System.out.println("Day number: " + today.getDayNumber());

        // ✅ Using enum in a switch statement
        switch (today) {
            case SATURDAY, SUNDAY -> System.out.println("🎉 It's the weekend!");
            default -> System.out.println("💼 Time to work!");
        }

        // ✅ Loop through all values (useful for menus or logs)
        System.out.println("\nAll days of the week:");
        for (Day d : Day.values()) {
            System.out.println(d + " -> Day #" + d.getDayNumber());
        }

        // ✅ Using enum in conditional logic
        if (today == Day.MONDAY) {
            System.out.println("😩 It's Monday again...");
        }

        // ✅ Convert string to enum (if input comes from a user or file)
        String input = "tuesday";
        Day inputDay = Day.valueOf(input.toUpperCase());
        System.out.println("\nParsed from string: " + inputDay);
    }
}
