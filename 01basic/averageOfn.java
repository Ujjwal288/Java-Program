//Program to find average of n number
import java.util.Scanner;

public class averageOfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number want to find average till :");
        int n = sc.nextInt();
        double sum = 0;
        for(int i=1; i<=n ;i++) {
            sum=sum+i;
        }
        double average = sum/n;
        System.out.println("Average of " + n + " number is " + average);
        sc.close();
    }
}
