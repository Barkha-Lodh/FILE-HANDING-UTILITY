import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ModifyFile {
    public static void main(String[] args) {
        String filePath ="Task1.txt";
        String newText ="\nThis line is added.";
        try (FileWriter writer = new FileWriter(filePath,true)) {
            writer.write(newText+System.lineSeparator());
        }catch (IOException e) {
            System.out.println("An error occurred while writing in file.");
            e.printStackTrace();
        }
        System.out.println("Modified text file:");
        try (BufferedReader reader= new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) !=null) {
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("An error occurred while reading in file.");
            e.printStackTrace();
        }
    }
}
