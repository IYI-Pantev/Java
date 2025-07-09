public class Student extends Person {

    double gpa;

    Student(String firstName, String lastName, double gpa) {
        super(firstName, lastName);
        this.gpa = gpa;
    }

    @Override
    void fullName() {
        super.fullName();
        System.out.println("GPA: " + this.gpa);
    }
}
