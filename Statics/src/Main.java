public class Main {
    public static void main(String[] args) {

        // static - variable or method belongs to the class, not the instance
        //        - shared among all objects of that class
        //        - can be accessed using ClassName.method() or ClassName.variable
        //        - useful for utility methods, constants, counters, or config
        //        - can't directly access non-static (instance) fields or methods


        Friend fr1 = new Friend("Jo");
        Friend fr2 = new Friend("Bob");
        Friend fr3 = new Friend("Anna");

        System.out.println(Friend.numOfFriends);

    }
}
