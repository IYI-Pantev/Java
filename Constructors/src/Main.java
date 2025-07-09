public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Patrick", 21, 3.2);
        Student student2 = new Student("Anna", 21, 2.2);

        System.out.println(student1.name);
        System.out.println(student2.name);

        student2.introduce();
    }
}
