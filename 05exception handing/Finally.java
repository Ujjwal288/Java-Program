//It is always executed wheather an exceprion occurs or not.

public class Finally {
    public static void main (String[] args) {
        try {
            int result = 10/0;
            System.out.println("Result :" + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception :" + e.getMessage());
        }
        finally {
            System.out.println("Finally block always execute :)");
        }
    }
}

