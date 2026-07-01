import java.util.Scanner;

public class SquareOfNum {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = sc.nextInt();
    int sqr = num*num;
    System.out.println("Square of num: "+sqr);
    }

}
