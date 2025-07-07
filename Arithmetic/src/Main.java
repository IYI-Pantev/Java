import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Arithmetic Operations
        int x = 10;
        int y = 2;
        int z;

        z = x + y; // addition
        System.out.println("x + y = " + z);

        z = x - y; // subtraction
        System.out.println("x - y = " + z);

        z = x * y; // multiplication
        System.out.println("x * y = " + z);

        z = x / y; // division
        System.out.println("x / y = " + z);

        z = x % y; // modulus (remainder)
        System.out.println("x % y = " + z);

        // Augmented Assignment Operators
        x += 5; // same as x = x + 5
        System.out.println("x += 5 → " + x);

        x -= 3; // same as x = x - 3
        System.out.println("x -= 3 → " + x);

        x *= 2; // same as x = x * 2
        System.out.println("x *= 2 → " + x);

        x /= 4; // same as x = x / 4
        System.out.println("x /= 4 → " + x);

        x %= 3; // same as x = x % 3
        System.out.println("x %= 3 → " + x);

        // Increment and Decrement Operators
        int count = 0;

        count++; // post-increment
        System.out.println("count++ → " + count);

        ++count; // pre-increment
        System.out.println("++count → " + count);

        count--; // post-decrement
        System.out.println("count-- → " + count);

        --count; // pre-decrement
        System.out.println("--count → " + count);

        // ORDER OF OPERATIONS [P-E-M-D-A-S]
        // Parentheses, Exponents (not native), Multiplication, Division, Addition, Subtraction

        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println("Order of operations result: " + result);
    }
}

