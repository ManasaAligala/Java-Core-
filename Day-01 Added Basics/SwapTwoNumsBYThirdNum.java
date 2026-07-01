import java.util.Scanner;
public class SwapTwoNumsBYThirdNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Before swapping Num1: ");
        int num1 = sc.nextInt();
        System.out.print("Before swapping Num2: ");
        int num2 = sc.nextInt();
     
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping num1: "+num1);
        System.out.println("After Swapping num2: "+num2);


    
    }
}
