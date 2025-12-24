//Program to find area of circle.

import java.util.Scanner;
public class areacircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double phi = 3.14;
        System.out.println("Enter radius of circle :");
        double radius = sc.nextDouble();

        double area = phi*radius*radius;
        System.out.println("Area of rectangle : " + area);
        sc.close();

    }
}
