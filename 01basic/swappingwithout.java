//Program for Swapping of 2 variable without using 3rd variable

public class swappingwithout {
    public static void main(String[] args) {
        int a = 50;
        int b = 100;
        System.out.println("Before Swapping :");
        System.out.println("num1 = "+ a + "  num2 = " + b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping :");
        System.out.println("num1  = " + a + "  num2  = " + b);
    }
}
