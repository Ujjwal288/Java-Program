import java.util.Scanner;
public class throwExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter age :");
        int age = sc.nextInt();
        if (age <18) {
            throw new RuntimeException("Age must be 18 year !!");
        }
        else {
            System.out.println("you are elegible to vote :)");
        }
    }
}
