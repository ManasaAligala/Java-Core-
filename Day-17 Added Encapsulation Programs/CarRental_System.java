import java.text.ListFormat.Style;
import java.util.Scanner;
public class CarRental_System {
    private int carId;
    private String carName;
    private String fuelType;
    private int  rentPerDay;
    private int  numberOfDays;
    int total ;
    int discount ;
    int final_rent;

    public void setcarId(int carId){
        if(carId>0){
            this.carId = carId;
        }else{
            System.out.println("ID Cant be less than zero");
        }
    }
    public void setcarName(String carName){
        if(carName.isEmpty()){
            System.out.println("Name cannot be empty");
        }else{
            this.carName = carName;
        }

    }
    public void setfuelType(String fuelType){
        if(fuelType.equalsIgnoreCase("petrol")){
            this.fuelType = "petrol";
        }else if(fuelType.equalsIgnoreCase("Diesel")){
            this.fuelType = "Diesel";
        }else if(fuelType.equalsIgnoreCase("Electronic")){
            this.fuelType = "Electronic";
        }else if(fuelType.equalsIgnoreCase("Hybrid")){
            this.fuelType = "Hybrid";
        }else{
            System.out.println("Invalid");
        }

    }
    public void setrentalPerDay(int rentalPerDay){
        if(rentalPerDay>0){
            this.rentPerDay = rentalPerDay;
        }else{
            System.out.println("cant be zero ");
        }

    }
    public void setnumberOfDays(int numberOfDays){
        if(numberOfDays>=1 && numberOfDays<=30){
            this.numberOfDays= numberOfDays;
        }else{
            System.out.println("Rental days are btw 1 and 30 days onlyyy");
        }

    }
    public int getcarId(){
        return carId;
    }
    public String getcarName(){
        return carName;
    }
    public String getfuelType(){
        return fuelType;
    }
    public int getrentalPerDay(){
        return rentPerDay;
    }
    public int getnumberOfDays(){
        return numberOfDays;
    }
    

    void calculateRent(){
        total = numberOfDays*rentPerDay;
        if (numberOfDays >= 7) {
        discount = total * 15 / 100;
        } else {
        discount = 0;
        }
        final_rent = total - discount;
    }
    void rentalDetails(){
         System.out.println(" car Id: "+getcarId());
         System.out.println("car Name: "+getcarName());
        System.out.println("fuel type: "+getfuelType());
        System.out.println("rent per day: "+getrentalPerDay());
          System.out.println("Number of days: "+getnumberOfDays());
          System.out.println("total rent: "+total);
           System.out.println("discount: "+discount);
            System.out.println("final rent: "+final_rent);
          
        
    }
    public static void main(String args[]){
        CarRental_System c = new CarRental_System();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car Id");
        c.setcarId(sc.nextInt());
        
        sc.nextLine();
        System.out.println("car Name");
        c.setcarName(sc.nextLine());
       // sc.nextLine();
        System.out.println("fuel type: ");
        c.setfuelType(sc.nextLine());

        System.out.println("rent per day: ");
        c.setrentalPerDay(sc.nextInt());
        System.out.println("Number of days: ");
        c.setnumberOfDays(sc.nextInt());
        c.calculateRent();
        c.rentalDetails();

        



    }
    
}
