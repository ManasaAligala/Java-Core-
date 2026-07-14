import java.util.Scanner;
public class CallAnotherConstructor_usingThis {
    String Vehicle_name;
    int Vehicle_cost;
    static Scanner sc = new Scanner(System.in);


    static String readName() {
        System.out.print("Enter Vehicle Name: ");
        return sc.nextLine();
    }

    // Method to read vehicle cost
    static int readCost() {
        System.out.print("Enter Vehicle Cost: ");
        return sc.nextInt();
    }
      
    CallAnotherConstructor_usingThis() {

       
        this(readName(), readCost());

        System.out.println("\nDefault Constructor Executed");
    }
    CallAnotherConstructor_usingThis(String vehicleName, int vehicleCost) {

        this.Vehicle_name = Vehicle_name;
        this.Vehicle_cost = Vehicle_cost;

        System.out.println("Parameterized Constructor Executed");
    }

    void display() {
        System.out.println("\nVehicle Details");
        System.out.println("Vehicle Name : " + Vehicle_name);
        System.out.println("Vehicle Cost : " + Vehicle_cost);
    }

    public static void main(String[] args) {

        CallAnotherConstructor_usingThis obj = new CallAnotherConstructor_usingThis();

        obj.display();
        
    }
}

