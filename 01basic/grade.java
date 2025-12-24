//Program to calculate grade from marks in 3 subjects.

import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of first subject :");
        int marks1 = sc.nextInt();
        System.out.println("enter marks of second subject :");
        int marks2 = sc.nextInt();
        System.out.println("enter marks of third subject :");
        int marks3 = sc.nextInt();

        int sum = marks1+marks2+marks3;
        double percentage = sum/3;
        System.out.println("Percentage : " + percentage);

        if (percentage>=90) {
            System.out.println("Grade A <3 ");
        }
        else if (percentage>=75 && percentage<90) {
            System.out.println("Grade B :)");
        }
        else if (percentage>=45 && percentage<75) {
            System.out.println("Grade C ");
        }
        else if (percentage>=33 && percentage<45) {
            System.out.println("Grade D ");
        }
        else {
            System.out.println("Better luck next time !! ");
        }
        sc.close();
    }
}
