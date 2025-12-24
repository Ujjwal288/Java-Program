//Basic calculator using switch statement
import java.util.Scanner;
public class switchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter the opetation you want to perform : +,-,*,/ ");
        char operator = sc.next().charAt(0);
        int result;
        switch(operator) {
            case '+':
            result = num1+num2;
            System.out.println("Result :" + result);
            break;

            case '-' :
            result = num1-num2;
            System.out.println("Result :" + result);
            break;

            case '*' :
            result = num1*num2;
            System.out.println("Result :" + result);
            break;

            case '/' :
            if (num2 == 0) {
                System.out.println("Denominator cannot be zero ");
                break;
            }
            else {
                result = num1/num2;
                System.out.println("Result :" + result);
                break;
            }
            default :
            System.out.println("Invalid operator !!");
        }
        sc.close();
    }
}