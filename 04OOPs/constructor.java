class Complex {    //creating class
    int a,b;
    Complex(int real, int imaginary) {   // Constructor
        a=real;    //class attributes
        b=imaginary;
    }
    void print() {    //class method
        System.out.println(a + "+" + b + "i");
    }
}
public class constructor {
    public static void main(String[] args) {
        Complex c1=new Complex(5,2);    //creating object
        c1.print();
        Complex c2=new Complex(2,6);
        c2.print();

    }
}