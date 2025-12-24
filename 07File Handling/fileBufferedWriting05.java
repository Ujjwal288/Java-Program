import java.io.*;
public class fileBufferedWriting05 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            bw.write("hello from buffer ");
            bw.newLine();
            bw.write("this is efficient writing ");
            bw.close();
            System.out.println("writing done :");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
