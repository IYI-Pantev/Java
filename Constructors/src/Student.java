public class Student {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void introduce() {
        String message = String.format("Hello,\nMy name is %s " +
                "and I am %d years old.\nMy current gpa score is %.1f", this.name, this.age, this.gpa);

        System.out.println(message);
    }

}
