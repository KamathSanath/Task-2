import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    String fileName;

    FileHandler(String fileName) {
        this.fileName = fileName;
    }

    synchronized void writeData(String data) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(data + "\n");
            System.out.println(data + " written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
