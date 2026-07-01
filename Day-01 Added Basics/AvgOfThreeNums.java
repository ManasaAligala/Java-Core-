import java.util.Scanner;

public class AvgOfThreeNums {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("num1: ");
        int num1 = sc.nextInt();
        System.out.print("num2: ");
        int num2 = sc.nextInt();
        System.out.print("num3: ");
        int num3 = sc.nextInt();
        int avg = (num1+num2+num3)/3;
        System.out.println("Avg of three nums: "+avg);
        
    }
}
