//program to calculate profit and loss.

import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the costPrice :");
        int CP = sc.nextInt();
        System.out.println("enter selling price :");
        int SP = sc.nextInt();

        if (SP>CP) {
            int profit = SP-CP;
            System.out.println("Profit :" + profit);
        }
        else if (CP>SP) {
            int loss = CP-SP;
            System.out.println("Loss :" + loss);
        }
        else {
            System.out.println("No profit no loss ");
        }
        sc.close();
    }
}
