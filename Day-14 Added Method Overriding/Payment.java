class Payment{
    double amount;
    void pay(){
        System.out.println("Payment is being processed...");
    }
}
class Upi extends Payment{
    
    String upi_Id;
    void showParentPayment(){
        super.pay();
    }
    void pay(){
        System.out.println("Payment of "+amount+" is successful using UPI.");

    }
    public static void main(String args[]){
        
      
        Upi  u = new Upi();
        u.amount = 5000;
        u.showParentPayment();
        u.pay();

    }
}
