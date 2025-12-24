class Dog {
    String name;  //class attributes
    String breed; //class attributes
}
public class classAttributes {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name="tommy";
        d1.breed="german shepherd";
        Dog d2=new Dog();
        d2.name="luffy";
        d2.breed="huuscy";
        System.out.println(d1.name);
        System.out.println(d1.breed);
        System.out.println(d2.name);
        System.out.println(d2.breed);        
    }
}