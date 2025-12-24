//Program for calculation of simple interest

import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principal amount :");
        int amount = sc.nextInt();
        System.out.println("Enter annual interest rate :");
        double rate = sc.nextDouble();
        System.out.println("enter time period :");
        int time = sc.nextInt();

        double simple_Interest = (amount*rate*time)/100;
        System.out.println("Simple Interest :" + simple_Interest);

        sc.close();
    }
}
