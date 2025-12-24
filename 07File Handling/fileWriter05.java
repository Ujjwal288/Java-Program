import java.io.*;
public class fileWriter05 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("sample.txt") ;
            fw.write("My name is Ujjwal \n");
            fw.write("this is a text file \n");
            fw.write("Java program");
            fw.close();
            System.out.println("Writing done !!");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
