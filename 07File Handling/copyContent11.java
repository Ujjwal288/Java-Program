import java.io.*;
public class copyContent11 {
    public static void main(String[] args) {
        try {
            FileInputStream r = new FileInputStream("harsh.txt");
            FileOutputStream w = new FileOutputStream("ujjwal.txt");
            int i;
            while((i=r.read()) !=-1) {
                w.write((char)i);
            }
            System.out.println("Data copied successfully");
            r.close();
            w.close();
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
