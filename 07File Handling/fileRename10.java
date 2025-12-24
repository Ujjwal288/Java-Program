import java.io.*;
public class fileRename10 {
    public static void main(String[] args) {
        File f = new File("output.txt");
        File r = new File("harsh.txt");
        if (f.exists()) {
            System.out.println(f.renameTo(r));
        }
        else {
            System.out.println("File does not exists");
        }
    }
}
