import java.io.*;
class Student implements Serializable {
    String name;
    int age;
    transient String password;  //this will not be saved
    public Student(String name , int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }
}
public class serialization12 {
    public static void main(String[] args) {
        Student s = new Student("Ujjwal", 20, "mySecret");
        try {
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.close();
            System.out.println("Object serialized successfully !");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

