import java.util.Scanner;

public class twoDarray03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        System.out.println("Two Dimentional Array is :");
        for (int i=0;i<rows;i++) {
            for (int j=0;j<column;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
