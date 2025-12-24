public class multipleCatch {
    public static void main(String[] args) {
        try {
            int [] arr = {1,2,3};
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occured");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound");
        }
        catch (Exception e) {
            System.out.println("Some other exception occured");
        }
    }
}
