import java.util.Scanner;
abstract class Device{
    String brand;
    double price;
    abstract void turnOn();
     abstract void turnOff();

} 
class Laptop extends Device{
    Laptop(String brand, int price){
        this.brand = brand;
        this.price = price;
    }
    void turnOn(){
        System.out.println("Laptop is in turn On mode");
    }
    void  turnOff(){
        System.out.println("Laptop is in turn Off mode");
    }
    void displayDetails(){
        System.out.println("Displaying Laptop Details");
        System.out.println("Laptop Brand: "+brand);
        System.out.println("Laptop Price: "+price);
    }
}
class Television extends Device{
     Television(String brand, int price){
        this.brand = brand;
        this.price = price;
    }
    void turnOn(){
        System.out.println("Television is in turn On mode");
    }
    void  turnOff(){
        System.out.println("Television is in turn Off mode");
    }
     void displayDetails(String tel_brand,int tel_price){
        System.out.println("Displaying Television Details");
        System.out.println("Television  Brand: "+tel_brand);
        System.out.println("Television  Price: "+tel_price);
    }

}
class Mobile extends Device{
     Mobile(String brand, int price){
        this.brand = brand;
        this.price = price;
    }
    void turnOn(){
        System.out.println("Mobile is in turn On mode");
    }
    void  turnOff(){
        System.out.println("Mobile is in turn Off mode");
    }
     void displayDetails(String m_brand,int m_price){
        System.out.println("Displaying Television Details");
        System.out.println("Television  Brand: "+m_brand);
        System.out.println("Television  Price: "+m_price);
    }

}
public class Test7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter laptop brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter laptop Price: ");
        int price = sc.nextInt();
        sc.nextLine();

        Laptop l = new Laptop(brand,price);
         
        System.out.print("Enter Tv brand: ");
        String tel_brand = sc.nextLine();
        System.out.print("Enter Tv Price: ");
        int tel_price = sc.nextInt();
        sc.nextLine();
        Television t = new Television(tel_brand,tel_price);
        
        System.out.print("Enter mobile brand: ");
        String m_brand = sc.nextLine();
        System.out.print("Enter mobile price: ");
        int m_price = sc.nextInt();
        Mobile m = new Mobile(m_brand,m_price);
        l.displayDetails();
        l.turnOn();
        l.turnOff();
        System.out.println("");
        System.out.println("");
        t.displayDetails(tel_brand, tel_price);
        t.turnOn();
        t.turnOff();
        System.out.println("");
        System.out.println("");
        m.displayDetails(m_brand, m_price);
        m.turnOn();
        m.turnOff();

    }
    
}
