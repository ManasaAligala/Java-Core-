 abstract class Vehicle{
    abstract  void start();
    
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car starts with key");
    }
}
class Bike  extends Vehicle{
      void start(){
        System.out.println("Bike starts with self-start");
        
    }
    
}
class Bus extends Vehicle{
      void start(){
        System.out.println("Bus starts with ignition");
        
    }
    
}
class Test3{
    public  static void main(String args[]){
        Bike b = new Bike();
        b.start();
         Bus bu = new Bus();
        bu.start();
         Car c = new Car();
        c.start();

    }
    
}
