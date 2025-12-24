//a) Using FileReader + BufferedReader

import java.io.*;
public class fileReading07 {
    public static void main(String[] args) {
        try {
            FileReader fw = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fw);
            String line ;
            while((line =br.readLine())!=null) {
                System.out.println(line);
            }
            br.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
