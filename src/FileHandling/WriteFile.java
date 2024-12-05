package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("C:\\Users\\HP\\Documents\\fileHandling\\index.txt")) {
            // To write into a file
//            writer.write("This is line 1\n");
//            writer.write("This is line 2\n");

            // To add to the file
            writer.append("text");

            System.out.println("File written successfully...");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
