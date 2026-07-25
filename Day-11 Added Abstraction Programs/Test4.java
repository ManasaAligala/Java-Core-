abstract class Bank{
    abstract void getInterestRate();
}
class HDFC extends Bank{
    void getInterestRate(){
        System.out.println("HDFC Provides 6%");

    }

}
class ICICI extends Bank{
    void getInterestRate(){
        System.out.println("ICICU Provides 8%");

    }

}
public class Test4 {
    //Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
    HDFC h = new HDFC();
    ICICI i = new ICICI();
    h.getInterestRate();
    i.getInterestRate();
    }

    
}
