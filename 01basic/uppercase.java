//Program to check entered alphabet is Uppercase or lowercase.

import java.util.Scanner;
public class uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a alphaphet :");
        char ch = sc.next().charAt(0);

        if (ch>='A' && ch<='Z') {
            System.out.println("Alphabet is Uppercase ");
        }
        else if (ch>='a'&& ch<='z') {
            System.out.println("Alphabet is lowecase ");
        }
        else {
            System.out.println("It is not a alphabet");
        }
        sc.close();
    }
}
