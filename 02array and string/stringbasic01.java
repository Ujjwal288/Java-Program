import java.util.Scanner;

public class stringbasic01 {
    public static void main(String[] args) {
        //String Decleration
        String name = "Ujjwal";
        String sentance = "My name is Ujjwal";
        System.out.println(name);
        System.out.println(sentance);

        //taking string user frrom name
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("My name is " + str);
        sc.close();

    }
}
