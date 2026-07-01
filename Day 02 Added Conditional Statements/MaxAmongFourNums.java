import java.util.Scanner;

public class MaxAmongFourNums {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number1: ");
        int num1 = sc.nextInt();
        System.out.print("Number2: ");
        int num2 = sc.nextInt();
        System.out.print("Number3: ");
        int num3 = sc.nextInt();
        System.out.print("Number4: ");
        int num4 = sc.nextInt();
        int max_123 = Math.max(Math.max(num1, num2),num3);
        int max_1234 = Math.max(max_123, num4);
        System.out.println(max_1234);
}
}
