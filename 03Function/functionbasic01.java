//Syntax :
//  returnType functionName(type arg1 , type arg2,.....) {
//      operations
//  }
//1.code reuseability
//2.Maintainability
//3.Readability
//4.Modularity
import java.util.Scanner;
public class functionbasic01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name :");
        String name = sc.nextLine();
        printMyName(name);
        sc.close();
    }

    public static void printMyName(String name) {
        System.out.println("My name is " + name);
    }
}