//Program to find greatest number among 3 numbers

public class greatestof3 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 25;
        int num3 = 55;

        if (num1>num2 && num1>num3) {
            System.out.println(num1 + " is greatest ");
        }
        else if (num2>num1 && num2>num3) {
            System.out.println(num2 + " is greatest");
        }
        else if (num3>num1 && num3>num2) {
            System.out.println(num3 + " is greatest");
        }
        else {
            System.out.println("numbers are equal !!");
        }
    }
}
