public class multipleThrows {
    void checknumber(int num) throws ArithmeticException , ArrayIndexOutOfBoundsException {
        if (num<0) {
            throw new ArithmeticException("Number cannot be negative ");
        }
        else if (num>10) {
            throw new ArrayIndexOutOfBoundsException("Number too large ");
        }
        else {
            System.out.println("Number is valid :)");
        }
    }
    public static void main(String[] args) {
        multipleThrows obj = new multipleThrows();
        try {
            obj.checknumber(9);
        }
        catch (Exception e) {
            System.out.println("Exception caught :" + e.getMessage());
        }
    }
}