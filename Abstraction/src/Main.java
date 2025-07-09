public class Main {
    public static void main(String[] args) {

        // abstraction = the process of hiding implementation details
        //               and showing only the essential features
        //               Abstract Classes CAN'T be instantiated directly
        //               'abstract' methods must be implemented by child class
        //               'concrete' methods are inherited

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);

        circle.display();
        System.out.println(circle.area());
        System.out.println(triangle.area());

    }
}
