import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price: ");
        int cost_p = sc.nextInt();
        System.out.println("Enter selling price: ");
        int selling_p = sc.nextInt();
        if(cost_p<selling_p){
            System.out.println("Profit");
        }else if(cost_p>selling_p){
            System.out.println("Loss");
        }else{
            System.out.println("Equal");
        }

    }
}
