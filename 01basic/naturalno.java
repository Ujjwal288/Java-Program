//Program to print natural number upto n terms
import java.util.Scanner;
public class naturalno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number till which want to print natural number");
        int n = sc.nextInt();
        System.out.println("Natural number upto " + n + " are ");
        for(int i = 1;i<=n;i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
