//Program to find the power of given number
import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        System.out.println("enter power of number :");
        int pow = sc.nextInt();
        int result = 1;
        for(int i=1; i<=pow; i++) {
            result = result*n;
        }
        System.out.println(n + " power " + pow + " is " + result);
        sc.close();
    }
}
