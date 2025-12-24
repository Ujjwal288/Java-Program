public class multipleTry {
    public static void main(String[] args) {
        try {
            int [] numbers={1,2,3};
            System.out.println(numbers[5]);

            try {
                int result = numbers[1]/0;
                System.out.println("Result :" + result);
            }
            catch (ArithmeticException e) {
                System.out.println("Arithmetic exception occured " + e.getMessage());
            }
            catch (Exception e) {
                System.out.println("some other exception occured : " + e.getMessage());
            }
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bound : " + e.getMessage());
            }
            catch (Exception e) {
                System.out.println("some other exception occured :" + e.getMessage());
            }
        }
    }

