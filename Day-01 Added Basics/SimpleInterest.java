import java.util.Scanner;

public class SimpleInterest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle: ");
        int principle = sc.nextInt();
        System.out.print("Enter time period: ");
        int time = sc.nextInt();
        System.out.print("Enter interest: ");
        int interest = sc.nextInt();
        System.out.println((principle*time*interest)/100);

    }
}
