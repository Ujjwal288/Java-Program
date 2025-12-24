//Voting system program.

import java.util.Scanner;
public class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age :");
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("Eligible for voting ");
        }
        else {
            System.out.println("not eligible for voting ");
        }
        sc.close();
    }
}
