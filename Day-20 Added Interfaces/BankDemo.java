import java.util.Scanner;
interface Bank{
    void deposit(double amount);
    void withdraw(double amount);
}
class SBI implements Bank{
    
    @Override
    public void deposit(double amount) {
        System.out.println("SBI deposit: "+amount);

        
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("SBI amount: "+amount);
        
    }
    
       
        
    

}
class HDFC implements Bank{

    @Override
    public void deposit(double amount) {
        System.out.println("HDFC deposit: "+amount);
       
    }

    @Override
    public void withdraw(double amount) {
         System.out.println("HDFC withdraw: "+amount);
    }
    
       
    

}
public class BankDemo {
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
           Bank s = new SBI();
        Bank h = new HDFC();
        System.out.print("Enter SBI Deposit Amount: ");
        double depositAmount = sc.nextDouble();

        System.out.print("Enter SBI Withdraw Amount: ");
        double withdrawAmount =sc.nextDouble();


        s.deposit(depositAmount);
        s.withdraw(withdrawAmount);

        System.out.println();

        System.out.print("Enter HDFC Deposit Amount: ");
        depositAmount = sc.nextDouble();


        System.out.print("Enter HDFC Withdraw Amount: ");
        withdrawAmount = sc.nextDouble();


        h.deposit(depositAmount);
        h.withdraw(withdrawAmount);
       

    }
    
}
