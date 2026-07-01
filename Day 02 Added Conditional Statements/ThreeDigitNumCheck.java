import java.util.Scanner;

public class ThreeDigitNumCheck {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        if(num>=100 && num<=999){
            System.out.println("Yes Its a three digit number");

        }else{
            System.out.println("No its not a three digit number");
        }
    }
}
