import java.util.Scanner;
public class Car {
String brand;
String model;
int price;
Car(String brand, String model,int price){
    this.brand = brand;
    this.model = model;
    this.price = price;
}
void displayCar(){
    System.out.println("");
        System.out.println("");
        System.out.println(" ** Displaying car details **");
        System.out.println("Car brand: "+brand);
        System.out.println("Car model: "+model);
        System.out.println("Car price: "+price);

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter brand : ");
        String brand = sc.nextLine();
        System.out.print("Enter model : ");
         String model = sc.nextLine();
        System.out.print("Enter price: ");
        int price = sc.nextInt();
        Car obj = new Car(brand,model,price);
        obj.displayCar();
        

        
    }
}
