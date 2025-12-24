//it is a mechanism in which one class inherits the properties of another class 


class Parentclass {
    void show() {
        System.out.println("parent class method");
    }
}
class Childclass extends Parentclass {
    void diplay() {
        System.out.println("child class method");
    }
}
public class inheritence {
    public static void main(String[] args) {
        Childclass c1=new Childclass();
        c1.show();
        c1.diplay();        
    }
}
