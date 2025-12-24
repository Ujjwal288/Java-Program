//Program to display even number upto n and find sum of enen numbers

import java.util.Scanner;

public class evennumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a integer n :");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Even number upto n are :");
        for(int i = 0;i<=n;i=i+2) {
            System.out.println(i);
            sum = sum+i;
        }
        System.out.println("Sum of even number are :" + sum);

        sc.close();
    }
}
