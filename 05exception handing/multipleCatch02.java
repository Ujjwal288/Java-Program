public class multipleCatch02 {
    public static void main(String[] args) {
        try {
            int [] arr = {1,2,3};
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occured :" + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of index :" + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Some other exception occured :" + e.getMessage());
        }
    }
}
