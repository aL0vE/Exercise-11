import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {
    public static void main(String[] args) {
        String writtenFile = "WriteAFileExample.txt";
        try (FileWriter filewrite = new FileWriter(writtenFile);
             BufferedWriter writer = new BufferedWriter(filewrite)) {
            writer.write("Hello, World!");
            writer.newLine();
            writer.write("This is another line.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}