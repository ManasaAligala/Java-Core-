import java.security.PublicKey;

class Delivery{
    int orderId;
String customerName;
void deliver(){
    System.out.println("Order is being Delivered");
}
}
class StandardDelivery extends Delivery{
    int deliveryDays;
    void showParentDelivery(){
        super.deliver();
    }
    void deliver(){
    System.out.println("Order " +orderId+ " will be delivered to " + customerName+ " in " +deliveryDays+ "  days using Standard Delivery.");
}

}
public class OnlineShoppingDeliverySystem {
    public static void main(String args[]){
       int orderId = 101;
      String customerName = "Manasa";
        int deliveryDays = 5;
        StandardDelivery s = new StandardDelivery();
        s.deliver();
        s.showParentDelivery();
    }
    
}
