public class Main {
    public static void main(String[] args) throws InterruptedException {

        // For Loop

        for(int i = 10; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy new year!");
    }
}
