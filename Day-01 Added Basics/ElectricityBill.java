import java.util.Scanner;

public class ElectricityBill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of units: ");
        int units = sc.nextInt();
        System.out.println("Enter cost per unit : ");
        int cost = sc.nextInt();
        System.out.println("Cost for bill: "+units*cost);
        }
}
