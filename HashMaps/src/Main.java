import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //HashMap = A data structure that stores key-value pairs
        //          Keys are unique, but values can be duplicated
        //          Does not maintain any order, but is memory efficient
        //          HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);

        //map.remove("apple")
        System.out.println(map);
        System.out.println(map.containsKey("apple"));
        System.out.println(map.get("apple"));

        if(map.containsValue(0.50)) {
            System.out.println("price 0.50 is in the store");
        }
        for(String key : map.keySet()) {
            System.out.println(key + " : $" + map.get(key));
        }
    }
}
