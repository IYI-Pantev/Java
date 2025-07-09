public class Main {
    public static void main(String[] args) {

        // super - Refers to the parent class
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes

        Person person = new Person("James", "Milton");
        person.fullName();
        Student student = new Student("Tom", "Riddle", 3.9);
        student.fullName();
    }
}
