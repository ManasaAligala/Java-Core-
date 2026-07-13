class Bike{
   
    void wheels(){
        System.out.println("Bike has 2 wheels");
    }
}
class Car extends Bike{
  void dubby(){
    super.wheels();
  }
   void wheels(){
    System.out.println("Car has 4 wheels");
   }
}
class Vehicle{
    public static void main(String args[]){
        Car c = new Car();
        c.wheels();
        c.dubby();
    }
}
