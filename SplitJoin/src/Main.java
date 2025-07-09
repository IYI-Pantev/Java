public class Main {
    public static void main(String[] args) {

        String csv = "James,Anna,Abrams";
        String data = "James Anna Arams";
        String[] names = data.split(" ");
        String newJoin = String.join(" | ", names);

        System.out.println(newJoin);

    }
}
