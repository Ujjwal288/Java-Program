class Student {
    
    String a;
    int b;
    Student(String name,int age) {    //Parameteried constructor
        a=name;
        b=age;
        System.out.println("Parameterized constructor");
    }
    Student() {                      //Default constructor
        System.out.println("default constructor");
    }
}
public class typesofconstructor {
    public static void main(String[] args) {
        Student s1=new Student();              //Default constructor  
        Student s2=new Student("ujjwal",20);   //Parameterized constructor
    }
}