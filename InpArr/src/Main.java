public class Main {
    public static void main(String[] args) {

        String[] foods = new String[3];

        foods[0] = "pizza";
        foods[1] = "hamburger";
        foods[2] = "taco";

        // for-Each loop or Enhanced loop
        for(String food : foods) {
            System.out.println(food);
        }
    }
}
