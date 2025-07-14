public class Main {
    public static void main(String[] args) {

        //Anonymous Class = doesn't have a name. Cannot be reused.
        //                  Add custom behaviour without having to create a new class.
        //                  Often used for one time uses - TimerTask, Runnable, callbacks

        Dog dog1 = new Dog();
        Dog dog2 = new Dog() {
            @Override
            void speak() {
                System.out.println("Scooby Doo says *Scooby Snack?*");
            }
        };

        dog1.speak();
        dog2.speak();

    }
}
