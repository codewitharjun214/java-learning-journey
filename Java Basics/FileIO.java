// FileIO.java
// Demonstrates basic file I/O in Java
import java.io.FileWriter;
import java.io.IOException;
public class FileIO {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, File!");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
