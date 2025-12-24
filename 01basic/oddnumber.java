//Program to display odd number upto n and find sum of odd numbers

import java.util.Scanner;
public class oddnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a integer n");
        int n = sc.nextInt();
        System.out.println("Odd number upto n are :");
        for(int i = 1; i<=n; i=i+2) {
            System.out.println(i);
            sum = sum+i;
        }
        System.out.println("sum of " + n + " odd number is " + sum);
        sc.close();
    }
}
