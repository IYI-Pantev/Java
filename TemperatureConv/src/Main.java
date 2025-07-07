import java.util.Scanner;

public class Main {
    public  static  void main(String[] args) {

        // Temperature Converter
        Scanner scanner = new Scanner(System.in);
        double tempInCelsius = -32.8;
        char userInp;
        char userPreference;

        System.out.print("Would you like the temperature in Celsius or Fahrenheit (C or F): ");
        userInp = scanner.next().charAt(0);

        userPreference = (Character.toUpperCase(userInp) == 'C') ? 'C' : 'F';

        if (userPreference == 'C') {
            System.out.printf("The temperature is: % .1f°C\n", tempInCelsius);
        } else {
            double tempInFahrenheit = (tempInCelsius * 9/5) + 32;
            System.out.printf("The temperature is: % .1f°F\n", tempInFahrenheit);
        }


        scanner.close();
    }
}
