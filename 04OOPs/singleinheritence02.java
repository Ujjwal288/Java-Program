class Vehicel {
    int price;
    String colour;
    int milage;
    void display() {
        System.out.println("price " + price);
        System.out.println("colour " + colour);
        System.out.println("milage " + milage);
    }
}
class Car extends Vehicel {
    String fueltype;
    int seats;
    void print() {
        System.out.println("fueltype " + fueltype);
        System.out.println("seats " + seats);
    }
}
public class singleinheritence02 {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.colour="black";
        c1.fueltype="petrol";
        c1.milage=15;
        c1.price=1500000;
        c1.seats=4;
        c1.display();
        c1.print();

        
    }
}
