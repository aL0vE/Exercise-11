import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DiaryWriter {
    public static void main(String[] args) {
        String diaryFile = "Diary.txt";
        try (FileWriter filewrite = new FileWriter(diaryFile);
             BufferedWriter writer = new BufferedWriter(filewrite);
             Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please start writing. Type 'END' or 'end' to stop.");
            String input;
            while (!(input = scanner.nextLine()).equalsIgnoreCase("END")) {
                writer.write(input);
                writer.newLine();
            }
            System.out.println("Your entries have been saved to Diary.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}