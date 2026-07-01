import java.util.Scanner;

public class SumOfDigitsInANum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        String num = sc.nextLine();
        
        int i=1;
        int sum_of_Digits = 0;
        for(i=0;i<num.length();i++){
            sum_of_Digits += (int)num.charAt(i) - '0';
        }
        System.out.println("Sum of Given Num Digits are: "+sum_of_Digits);
        
        
    }
}
