import java.util.Scanner;
public class question02 {
    public static int calculateSum(int a , int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calculateSum(a,b));
        sc.close();
    }

}
