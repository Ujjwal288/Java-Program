//Take an array as input from the user Search for a given number x and print the index at which it occurs
import java.util.Scanner;
public class questionarray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 10;
        System.out.println("enter the size of the array :");
        int size = sc.nextInt();
        int a [] = new int[size];
        System.out.println("enter the element of array :");
        for(int i=0;i<size;i++) {   
            a[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++){   //if we don't know the size of the array we can use arrayname.length
            if (a[i] == x) {
                System.out.println(x + " is found at index : " + i);
            }
        }
        sc.close();
    }
}
