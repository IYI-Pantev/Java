public class Main {
    public static void main(String[] args) {

        // ... (ellipsis)

       int result = add(1, 2, 3, 4, 5);
        System.out.println(result);
    }

    static int add(int... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }

}
