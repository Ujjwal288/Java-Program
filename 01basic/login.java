//Login problem program.

import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usernamestored = "ujjwalkumar";
        String passwordstored = "ujjwal288";

        System.out.println("enter username :");
        String username = sc.nextLine();
        System.out.println("enter password :");
        String password = sc.nextLine();

        if (username.equals(usernamestored) && password.equals(passwordstored)) {
            System.out.println("Login Successful ");
        }
        else {
            System.out.println("Incorrect username or password");
        }
        sc.close();

    }
}
