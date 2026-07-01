import java.util.Scanner;

public class LeastCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        int i=1;
       // int lcm = 0;
        int lcm = Math.max(num1, num2);
        while (true) { 
            if(lcm%num1==0 && lcm%num2==0){
                System.out.println("Lcm of two nums: "+lcm);
                break;
            }lcm++;
        }
    }

    }


