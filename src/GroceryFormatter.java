import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GroceryFormatter {
    public static void main(String[] args) {
        String inputPath = "C:\\Downloads\\Groceries.txt";
        String outputPath = "FormattedGroceries.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            writer.write("**********************************************\n");
            writer.write("ID            Item            Quantity (KG)  Price (€)\n");
            writer.write("**********************************************\n");
            String line;
            double total = 0;
            while ((line = reader.readLine())!= null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String item = parts[1];
                double quantity = Double.parseDouble(parts[2]);
                double price = Double.parseDouble(parts[3]);
                writer.write(String.format("%-15d%-15s%-15.1f%-15.2f\n", id, item, quantity, price));
                total += quantity * price;
            }
            writer.write("**********************************************\n");
            writer.write("The grocery shopping total is: €" + total + "\n");
            writer.write("**********************************************\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}