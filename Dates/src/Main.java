import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args){

        // ✅ 1. Get Current Date, Time, and DateTime
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("📅 Current date: " + currentDate);
        System.out.println("⏰ Current time: " + currentTime);
        System.out.println("📆 Current datetime: " + currentDateTime);

        // ✅ 2. Formatting DateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatted = currentDateTime.format(formatter);
        System.out.println("🕓 Formatted: " + formatted);

        // ✅ 3. Parsing a String into a DateTime
        String birthdayStr = "21-12-1990 15:45:00";
        DateTimeFormatter parseFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime birthday = LocalDateTime.parse(birthdayStr, parseFormat);
        System.out.println("🎉 Birthday parsed: " + birthday);

        // ✅ 4. Adding/Subtracting Time
        LocalDate nextWeek = currentDate.plusWeeks(1);
        LocalTime inTenMinutes = currentTime.plusMinutes(10);
        System.out.println("📅 One week from now: " + nextWeek);
        System.out.println("⏳ 10 minutes from now: " + inTenMinutes);

        // ✅ 5. Comparing Dates
        LocalDate someDate = LocalDate.of(2025, 7, 8);
        if (currentDate.isBefore(someDate)) {
            System.out.println("✅ Today is before July 8, 2025");
        }

        // ✅ 6. Difference between two dates
        long daysUntil = ChronoUnit.DAYS.between(currentDate, someDate);
        System.out.println("📆 Days until July 8, 2025: " + daysUntil);
    }
}
