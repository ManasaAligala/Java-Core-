import java.util.Scanner;
public class Bank {
    String Account_holder;
    int amount ;
    static int interest = 10 ;
    int time;
    Bank(String Account_holder,int amount ,int time){
        this.Account_holder = Account_holder;
        this.amount = amount;
        //this.interest = interest;
        this.time = time;

    }
     void displaying_details(){
         System.out.println("Account holder name: "+Account_holder);
         System.out.println("Amount : "+amount);
         System.out.println("interest: "+interest);
         System.out.println("time: "+time);
    }
    void calculate_interest(){
        System.out.println((amount*time*interest)/100);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Account holder name: ");
        String Account_holder = sc.nextLine();
         System.out.println("");
         System.out.println("Amount : ");
         int amount = sc.nextInt();
          //System.out.println("interest: ");
         // int interest = sc.nextInt();
           System.out.println("time: ");
           int time = sc.nextInt();
           Bank obj = new Bank(Account_holder, amount, time);
           obj.displaying_details();


    }

    
}
