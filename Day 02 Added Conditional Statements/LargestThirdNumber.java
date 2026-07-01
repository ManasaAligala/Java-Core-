import java.util.Scanner;

public class LargestThirdNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();
        System.out.print(":Enter num3: ");
        int num3 = sc.nextInt();
        int max_dig = Math.max(Math.max(num1, num2),num3);
        System.out.println("Largest number : "+max_dig);
    }
}
