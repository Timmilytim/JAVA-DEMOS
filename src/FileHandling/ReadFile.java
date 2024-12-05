package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\HP\\Documents\\fileHandling\\home.html"))){
            // A program to read a file
            String line;
            while ((line = reader.readLine())!= null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
