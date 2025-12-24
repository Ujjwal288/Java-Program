//Take an matrix as input from the user Search for a given number x and print the index at which it occurs

import java.util.Scanner;
public class questionarray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 5;
        System.out.println("enter the number of rows :");
        int rows = sc.nextInt();
        System.out.println("enter number of column :");
        int column = sc.nextInt();
        int arr [][] = new int [rows][column];
        System.out.println("enter element of array :");
        for (int i=0;i<rows;i++) {
            for (int j=0;j<column;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<rows;i++) {
            for (int j=0;j<column;j++) {
                if (arr[i][j] == x) {
                    System.out.println(x + " is found at index : " + i + " , " + j);
                }
            }
        }
        sc.close();
    }
}
