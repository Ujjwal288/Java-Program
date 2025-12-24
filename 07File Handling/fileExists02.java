import java.io.*;
public class fileExists02 {
    public static void main(String[] args) {
        File file = new File ("sample.txt");
        if(file.exists()) {
            System.out.println("Files exists");
        }
        else {
            System.out.println("File does not exists");
        }
    }
}
