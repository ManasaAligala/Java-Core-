import java.util.Scanner;
import java.util.Random;
class BankAccount{
    String name;
    int age;
    long phoneno;
    String email;
    long acc_num;
    long intialdeposit;
    long amount;
    long balance;
    BankAccount(String name,int age,long phoneno,String email){
    
       this.name = name;
       this.age = age;
       this.phoneno = phoneno;
       this.email = email;
       
    
    }
    void PersonalDetails(){
        System.out.println("Personal Details of the Bank Holder ");
        System.out.println("Name: "+name);
       System.out.println("Age: "+age);
       System.out.println("Phoneno: "+phoneno);
       System.out.println("email: "+email);
    }
    
    boolean eligibility(int age){
        if(age>=18){
            System.out.println("Eligible to Hold Bank Acount");
            return true;
        }
        else{
           System.out.println("Not Eligible to Hold Bank Account (Age Restriction >= 18)");
           return false;
        }

    }


    
    void OpenBankAccount(){
          Random r = new Random();
          acc_num = 10000 + r.nextInt(90000);
          System.out.println("Account Created Successfully");
          System.out.println("Account Number: "+acc_num);
          balance = 500;
          System.out.println("Opening balance: "+balance);
    }

    void Deposit(long amount){
       
        balance += amount;
        System.out.println("Balance: "+balance);
    }

    void withdraw(long withdraw_amount){
            if(balance>=withdraw_amount){
                balance -= withdraw_amount;
                System.out.println("Remaining balance: "+balance);

            }else{
                System.out.println("Insufficient Balance");
            }
    }


    

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
       
       // acc_num = 10000+ r.nextInt(90000);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter Phoneno: ");
        long phoneno = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
       
        BankAccount obj = new BankAccount(name,age,phoneno,email);
        System.out.println(" ");
        obj.PersonalDetails();

        if (obj.eligibility(age)) {

        obj.OpenBankAccount();

        System.out.print("Enter amount to deposit: ");
        long amount = sc.nextLong();
        obj.Deposit(amount);

        System.out.print("Enter amount to withdraw: ");
        long withdraw_amount = sc.nextLong();
        obj.withdraw(withdraw_amount);

    } else {

        System.out.println("Account cannot be created.");

}
       

        

        
         
        
        





    }
}