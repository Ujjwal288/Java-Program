//Write a program to check entered number is prime or composite 
import java.util.Scanner;
public class primecomposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int  n = sc.nextInt();
        int count = 0;
        if (n<=0) {
            System.out.println("please enter a positive number !!");
        }
        for (int i=1 ;i<=n ;i++) {
            if (n%i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(n + " is a prime number ");
        }
        else if (count >= 2) {
            System.out.println(n + " is a composite number");
        }
        sc.close();
    }
    
}
