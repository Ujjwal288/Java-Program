//It is a technique of providing only the essential details to the user by hiding the unnessary or irrelevant 
//details of an entity

//It is achived by either Abstract class or interface

abstract class Vehicel {   //abstract class
    abstract void start ();      //abstract method 
    //abstract method has no body
    void stop() {
        System.out.println("Vehicel stopped");
    }
}
//now we have to use abstarct method to all class which is inheriteted by vehicel class
class Car extends Vehicel {
    void start() {
        System.out.println("car starts with key");
    }
}
class Bike extends Vehicel {
    void start() {
        System.out.println("Bike starts with kick");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.start();
        c1.stop();
        Bike b1=new Bike();
        b1.start();
        b1.stop();        
    }
    
}
