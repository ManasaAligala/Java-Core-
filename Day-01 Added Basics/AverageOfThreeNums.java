
import java.util.Scanner;
public class AverageOfThreeNums {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Num1: ");
        int num1 = sc.nextInt();
        System.out.print("Num2: ");
        int num2 = sc.nextInt();
        System.out.print("Num3: ");
        int num3 = sc.nextInt();
        int max_num = Math.max(Math.max(num1, num2),num3);
        System.out.println("Max num: "+max_num);

    }
}
