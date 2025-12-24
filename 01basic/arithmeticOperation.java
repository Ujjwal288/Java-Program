//Program for Arithmetic Operators

import java.util.Scanner;
public class arithmeticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number :");
        int num1=sc.nextInt();
        System.out.println("Enter second number :");
        int num2= sc.nextInt();

        //Arithmetic operarion ;
        int add=num1+num2;
        System.out.println("Addition :" + add);
        int sub=num1-num2;
        System.out.println("Subtraction :" + sub);
        int multi=num1*num2;
        System.out.println("Multiplication :" + multi);
        if (num2==0) {
            System.out.println("Number cannot be divisible by 0");
        }
        else {
            double div = num1/num2;
            System.out.println("Divide : " + div);
        }
        sc.close();
    }
}
