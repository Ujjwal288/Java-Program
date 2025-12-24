import java.util.Scanner;

public class userinputarray02 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the soze of the array :");
        int size = sc.nextInt();
        int arr [] = new int[size];
        //for input
        System.out.println("Enter the element of array :");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        //for output
        System.out.println("the array is :");
        for(int i=0;i<size;i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
