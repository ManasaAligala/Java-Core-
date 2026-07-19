import java.util.Scanner;
public class BankAccount {
    private int  Acc_num;
    private  String Acc_holder;
    private  long balance;
    int depo_amount;
    int with_amount;
    public void setAcc_num(int  Acc_num){
        this.Acc_num = Acc_num;

    }
    public void setAcc_holder(String Acc_holder){
        this.Acc_holder = Acc_holder;
        
    }
    public void setbalance(long balance){
        
        if(balance>0){
           this.balance= balance;
        }else{
            System.out.println("Balance cannot be less than zero");
        }
        
    }
    public int getAcc_num(){
        return Acc_num;
    }public String getAcc_holder(){
        return Acc_holder;
    }
    public long getbalance(){
        return balance;
    }
    public void deposit(int depo_amount){
        if(depo_amount>0){
        balance += depo_amount;
        System.out.println("After adding amount : "+balance);
        }
    }

    public void withdraw(int with_amount){
        if(with_amount<=balance){
             balance -= with_amount;
             System.out.println("After withdraw: "+balance);
        }else{
            System.out.println("Insufficient Balance");
        }
       

    }

    void Bankdetails(){
        System.out.println(" ");
        System.out.println("Bank Holder name: "+getAcc_holder());
        System.out.println("Account number: "+getAcc_num());
        System.out.println("Balance: "+getbalance());
        

    }

    
    
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BankAccount a = new BankAccount();
        System.out.print("Enter Acc_Number : ");
        a.setAcc_num(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter name: ");
        a.setAcc_holder(sc.nextLine());
        System.out.print("Initial Amount: ");
        a.setbalance(sc.nextLong());
       
       System.out.print("Enter  deposit amount: ");
       a.depo_amount= sc.nextInt();
       a.deposit(a.depo_amount);
       System.out.print("Enter withdraw amount: ");
       a.with_amount = sc.nextInt();
       a.withdraw(a.with_amount);
       a.Bankdetails();



        


    }
    
}
