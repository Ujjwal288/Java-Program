//Program to find the sum of numbers of entered digit.

import java.util.Scanner;
public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = sc.nextInt();
        int rem = 0;
        int sum = 0;
        while (num!=0) {
            rem = num%10;
            sum = sum+rem;
            num=num/10;
        }
        System.out.println("sum of entered number is:" + sum);
        sc.close();
    }
    
}
