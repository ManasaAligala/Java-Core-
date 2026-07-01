import java.util.Scanner;

public class DivBy5And11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();
        if(num%5==0 && num%11==0){
            System.out.println("Divisible by both");
        }else{
            System.out.println("Not Divisible by both ");
        }
    }
}
