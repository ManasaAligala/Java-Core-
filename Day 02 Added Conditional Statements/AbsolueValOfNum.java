import java.util.Scanner;

public class AbsolueValOfNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        int num = sc.nextInt();
        System.out.println("Absolute value: "+(Math.abs(num)));
    }
}
