import java.util.Scanner;
class ATM {
    float balance;
    int PIN=1511;
    void pinCheck () {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the PIn :");
        int enterPin=sc.nextInt();
        if (enterPin==PIN) {
            menu();
        }
        else {
            System.out.println("enter the valid pin ");
        }
    }
    void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Check account balance :");
        System.out.println("2. Withdraw money :");
        System.out.println("3.Deposit money :");
        System.out.println("4. exit :");
        System.out.println("enter your choice :");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                checkBalance();
                break;
            case 2:
                withdrawMoney();
                break;
            case 3:
                depositMoney();
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid choice !!!!");
                break;
        }
    }
    void checkBalance () {
        System.out.println("Balance " + balance);
        menu();
    }
    void withdrawMoney () {
        System.out.println("enter the amounnt want to withdraw :");
        Scanner sc=new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>balance) {
            System.out.println("Insufficent balance!!!");
        }
        else {
            balance-=amount;
            System.out.println("Money withdrawn successfully");
        }
        menu();
    }
    void depositMoney() {
        System.out.println("enter amount to deposit :");
        Scanner sc= new Scanner (System.in);
        float money=sc.nextFloat();
        balance+=money;
        System.out.println("Money deposited successfully");
        menu();
    }
    
}
public class atmMachine {
    public static void main(String[] args) {
        ATM obj=new ATM();
        obj.pinCheck();
    }
}