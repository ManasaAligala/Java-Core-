
import java.util.Scanner;
public class ArithematicOperationsOnTwoNums {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("num1: ");
        int num1 = sc.nextInt();
        System.out.print("num2: ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        int sub = num1-num2;
        int mul = num1*num2;
        int div = num1/num2;
        int rem = num1%num2;
        System.out.println("sum: "+sum);
        System.out.println("sub: "+sub);
        System.out.println("mul: "+mul);
        System.out.println("div: "+div);
        System.out.println("rem: "+rem);
        
        

    }
}
