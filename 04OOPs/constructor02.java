class Student {
    String a; 
    int b;
    Student(String name, int age) {
        a=name;
        b=age;
        System.out.println("Student name is "+ a + " and age is " + b); 
    }
}
public class constructor02 {
    public static void main(String [] args) {
            Student s1=new Student("ujjwal",20);
            Student s2=new Student ("nitin",20);

    }
}

