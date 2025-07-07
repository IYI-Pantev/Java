public class Main {
     public static void main(String[] args) {

         // ✅ Variables
         // 🖋️Primitive(stack) vs Reference(heap)💱
         // -----------    ----------
         // int            string
         // double         array
         // char           object
         // boolean

         // 2 Steps to creating a variable
         // ------------------------------
         // 1. declaration
         // 2. assignment

         int age = 30;
         double quantity = 4.3;

         String message = String.format("%s litters of milk", quantity);
         System.out.println(message);

         double price = 19.9999;
         double truncated = Math.floor(price * 100) / 100;
         String priceOut = String.format("Final price: €%.2f", truncated);
         System.out.println(priceOut);

        char grade = 'A';
        char currency = '€';

        boolean isStudent = true;

        String food = "pizza";

     }
}
