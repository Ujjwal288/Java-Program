//Program of table from 1 to 5
public class tablefrom1to5 {
    public static void main(String[] args) {
        System.out.println("Table form 1 to 5");
        for(int i=1;i<=5;i++) {
            System.out.println("Table of " + i + " is :");
            for(int j=1;j<=10;j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}