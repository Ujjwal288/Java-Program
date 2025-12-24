public class tryCatch {
    public static void main(String[] args) {
        try {
            int a = 10/0;
            System.out.println("Result : "+ a);
        }
        catch(ArithmeticException e) {
            System.out.println("Error : cannot be divided by 0");
            System.out.println(e);
        }
    }
}