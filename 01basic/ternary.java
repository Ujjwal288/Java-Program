//Use of ternary operator
import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age :");
        int age = sc.nextInt();
        String result = (age<=18)? "Minor" : "Adult";
        System.out.println(result);

        int a = 10;
        int b = 20;
        int ans = (a>b)? a:b;
        System.out.println("Maximum is :" + ans);
        sc.close();
    }
}
