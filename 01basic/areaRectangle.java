//Program to find area of rectangle

import java.util.Scanner;
public class areaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of rectangle :");
        double length = sc.nextDouble();
        System.out.println("enter the breathe of rectangle :");
        double breathe = sc.nextDouble();
        
        double area = length*breathe;
        System.out.println("Area of rectangle :" + area);
        sc.close();
    }
}
