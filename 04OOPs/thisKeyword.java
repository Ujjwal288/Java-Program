class Value {
    int x;      //class variable x
    Value (int x) {
        this.x=x;     //refers to class variable x
    }
}
public class thisKeyword {
    public static void main(String[] args) {
        Value num =new Value(5) ;
        System.out.println(num.x);
    }
}