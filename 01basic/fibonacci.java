//Write a program to print Fibonnaci series

import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the term you want to print fibonacci series :");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        System.out.println("Fibonacci series is :");
        for (int i=1 ; i<=n ;i++) {
            System.out.print(c + " ");
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println();
        sc.close();
    }
}
