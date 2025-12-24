class Dog {
    String name;       //class attributes
    void bark() {      // class method
        System.out.println(name + " barks");
    }
    void eat() {       //class method
        System.out.println(name + " eats");
    }
}
public class classMethod {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.name="tommy";
        d1.bark();
        d1.eat();
        Dog d2=new Dog();
        d2.name="luffy";
        d2.bark();
        d2.eat();

    }
}