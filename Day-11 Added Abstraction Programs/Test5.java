import java.util.Scanner;
abstract  class Payment{
      abstract void makePayment(double amount);
}
class CreditCardPayment extends Payment{
   
    
    void makePayment(double amount){
    System.out.println("Payment processing...");
    System.out.println("Credit Card payment of " +amount+ " successful");
    }

}
class UPIPayment extends Payment{
   
    
    
    void makePayment(double amount){
    System.out.println("Payment processing...");
    System.out.println("UPI payment of " +amount+ " successful");
    }

}
class CashPayment extends Payment{
   
    void makePayment(double amount){
    System.out.println("Payment processing...");
    System.out.println("Cash payment of " +amount+  " successful");
    }

}
public class Test5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Credit card payment: ");
        double creditAmount = sc.nextDouble();

        System.out.print("UPI payment: ");
        double upiAmount = sc.nextDouble();

        System.out.print("Cash payment: ");
        double cashAmount = sc.nextDouble();

        CreditCardPayment c = new CreditCardPayment();
        UPIPayment u = new UPIPayment();
        CashPayment ca = new CashPayment();

        c.makePayment(creditAmount);
        u.makePayment(upiAmount);
        ca.makePayment(cashAmount);



        



    }
    
}
