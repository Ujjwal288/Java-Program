//Program to find greatest number among 2 number

import java.util.Scanner;
public class greatestof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("enter second number :");
        int num2 = sc.nextInt();

        if(num1>num2) {
            System.out.println(num1 + " is greatest");
        }
        else if (num1<num2) {
            System.out.println(num2 + "  is greatest");
        }
        else {
            System.out.println("numbers are equal ");
        }
        sc.close();
    }
}
