import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base: ");
        int n = sc.nextInt();
        System.out.println("Enter power: ");
        int power = sc.nextInt();
        double ans = Math.pow(n,power);
        System.out.println("Power of a number: "+(int)ans);
    }
}
