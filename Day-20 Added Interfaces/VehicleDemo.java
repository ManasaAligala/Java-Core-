interface Vehicle{
   void  start();
   void stop();
   void fuelType();
}
public class VehicleDemo implements Vehicle {
    @Override

     public void start(){
            System.out.println("Vehicle has been started");
        }
        @Override
        public void stop(){
            System.out.println("Vehicle has been stopped");
        }
        @Override
        public void fuelType(){
            System.out.println("Vehicle uses petrol");
        }
    
    public static void main(String[] args) {
        VehicleDemo v = new VehicleDemo();
        v.fuelType();
        v.start();
        v.stop();

       

    
}
}
