import java.io.*;
import java.util.Scanner;
public class fileScanner09 {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
