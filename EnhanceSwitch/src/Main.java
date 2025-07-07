public class Main {
    public static void main(String[] args) {

        String day = "Saturday";

        // Enhanced Switches

//        switch (day) {
//            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Its a weekday 💸");
//            case "Saturday", "Sunday" -> System.out.println("Its a weekday 😎🎉🎶");
//            default -> System.out.println(day + " is not a day");
//
//        }
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Its a weekday 💸");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Its a weekend 😎🎉🎶");
                break;
            default:
                System.out.println(day + " is not a day");
        }

    }
}
