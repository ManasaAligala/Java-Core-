import java.util.Scanner;
interface FoodDelivery {
    void placeOrder(String foodItem);
}
class Swiggy implements FoodDelivery{
    public void placeOrder(String foodItem){
        System.out.println("Swiggy order: "+foodItem);

    }

}
class  Zomato implements FoodDelivery{
    public void placeOrder(String foodItem){
        
        System.out.println("Zomato order: "+foodItem);

    }
    
}
public class FoodDeliveryDemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Swiggy s = new Swiggy();
        
        System.out.print("Enter item: ");
        String i = sc.nextLine();
       
        s.placeOrder(i);
        
        Zomato z = new Zomato();
        System.out.print("Enter item: ");
        String it = sc.nextLine();
        z.placeOrder(it);

        
    }
    
}
