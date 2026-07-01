import java.util.Scanner;

public class InvertedRightAngle1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no of columns : ");
        int cols = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=5;j<=i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
}
}
