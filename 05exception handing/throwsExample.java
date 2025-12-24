public class throwsExample {
    static void divisiondemo(int divident , int divisor) throws ArithmeticException{
        int result = divident/divisor;
        System.out.println("Result " + result); 
    }
    public static void main(String[] args) {
        try {
            divisiondemo(15, 0);
        }
        catch (Exception e) {
            System.out.println("exception " + e.getMessage());
        }     
    }
}
