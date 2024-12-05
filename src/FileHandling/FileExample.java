package FileHandling;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\HP\\Documents\\fileHandling\\index.txt");
        if (file.exists()){
            System.out.println("File Exists: " + file.getName());
        }else {
            System.out.println("The file does not exist...");
        }
    }
}
