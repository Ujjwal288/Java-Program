//Program for Swapping of 2 variable with using 3rd variable

public class swappingwith {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Before swapping :");
        System.out.println("num1 = " + num1 + "  num2 = " + num2);

        int num3=num1;
        num1 = num2;
        num2=num3;
        System.out.println("After swapping :");
        System.out.println("num1 = " + num1 + "  num2 = " + num2);
    }
}
