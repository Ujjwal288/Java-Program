//Program to check validity of a traingle

import java.util.Scanner;
public class traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first angle of traingle :");
        int ang1 = sc.nextInt();
        System.out.println("enter second angle of traingle :");
        int ang2 = sc.nextInt();
        System.out.println("Enter third angle of traingle :");
        int ang3 = sc.nextInt();

        int sum = ang1 + ang2 + ang3;
        if (sum <= 180 && ang1>0 && ang2>0 && ang3>0) {
            System.out.println("Traingle is valid :) ");
        }
        else {
            System.out.println("traingle is invalid !!");
        }
        sc.close();

    }
}
