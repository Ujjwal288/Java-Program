class Student {    // creating class
    String name;
    int age;
}
public class classObject {
    public static void main(String[] args) {
        Student s1=new Student ();  //creating object
        s1.age=20;
        s1.name="ujjwal";
        System.out.println(s1.name);
        System.out.println(s1.age);        
    }
}