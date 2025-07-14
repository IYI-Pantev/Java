import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        // Generics = Allow classes and methods to work with different types
        //            while providing compile-time type safety and reusability.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (specifies the type)

        Box<Integer> box = new Box<>();

        box.setItem(33);
        System.out.println(box.getItem());

        Product<String, Double> product = new Product<>("Chair", 193.34);
        System.out.println(product.getItemAndPrice());
    }
}
