import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        int num = sc.nextInt();
        int original = num;
        int digit = 0;
        int sum = 0;
        while(num!=0){
          
            digit = num%10;
            sum += digit*digit*digit;
            num = num/10;

        }
        System.out.println("sum: "+sum);
        if(sum==original){
            System.out.println("Yes ArmStrong number");
        }else{
            System.out.println("No Its not an ArmStrong number");
        }
    }
}
