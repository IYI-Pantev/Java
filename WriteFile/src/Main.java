import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Write file using Java (4 popular ways)

        //FileWriter = Good for small to mid-sized text files.
        //BufferedWrite = Better performance for large text files.
        //PrintWriter = Best for structured data, like reports or logs.
        //FileOutputStream = Best for binary files (e.g images, audio files)



        try(FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\test.txt")) {
            writer.write("I like pepperoni!");
            System.out.println("File has been written");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
