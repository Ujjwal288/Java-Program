import java.io.*;
public class fileInputStream08 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("data.bin");
            int data;
            while ((data=fis.read()) !=-1) {
                System.out.println((char)data);
            }
            fis.close();
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
