import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadGroceries {
    public static void main(String[] args) {
        String path = "C:\\Users\\30974\\Downloads\\Groceries (3).txt";
        try (FileReader fileread = new FileReader(path);
             BufferedReader reader = new BufferedReader(fileread)) {
            String line;
            while ((line = reader.readLine())!= null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}