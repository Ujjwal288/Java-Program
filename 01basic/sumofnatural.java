//Progra to find the sum of n natural number

import java.util.Scanner;
public class sumofnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n :");
        int n = sc.nextInt();
        int sum = 0;
        if (n<=0) {
            System.out.println("Please enter positive number !!");
        }
        else {
            System.out.println("Natural number upto n is :");
            for(int i = 1; i<=n; i++) {
                System.out.println(i);
                sum=sum+i;
            }
            System.out.println("Sum of nutural number n is :" + sum);
        }
        sc.close();
    }
}
