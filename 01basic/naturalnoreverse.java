//Program to display natural number upto n in reverse order

import java.util.Scanner;
public class naturalnoreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number n :");
        int n = sc.nextInt();

        if (n<=0) {
            System.out.println("please enter positive number ");
        }
        else {
            System.out.println("Natural number upto " + n + " in reverse order is ");
            for(int i = n ; i>=1 ; i--) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
