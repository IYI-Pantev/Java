public class Main {
    public  static  void main(String[] args) {

        // String Methods

//        String name = "Bro Code";

//        int length = name.length();
//        char letter = name.charAt(4);
//        //name = name.replace("o", "a");
//
//        System.out.println(length);
//        System.out.println(letter);
//        System.out.println(name);
//        System.out.println(name.isEmpty());
//        System.out.println(name.contains(" "));
//
//        if (name.equalsIgnoreCase("bro code")) {
//            System.out.println("Hello " + name + '!');
//        } else  {
//            System.out.println("no code");
//        }

        // Substring Methods

        String email = "nobody@gmail.com";
         int index = email.indexOf('@');
        String username = email.substring(0, index);
        String emailProvider = email.substring(index + 1);
        System.out.println(username);
        System.out.println(emailProvider);


    }

}
