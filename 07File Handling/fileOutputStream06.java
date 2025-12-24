import java.io.*;
public class fileOutputStream06 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos =  new FileOutputStream("data.bin");
            String text = "binary data writing";
            fos.write(text.getBytes());
            fos.close();
            System.out.println("Binary writing done");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}