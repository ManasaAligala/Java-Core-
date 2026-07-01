import java.util.Scanner;

public class numBelongsTORange {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num1 = sc.nextInt();
        System.out.print("Range1: ");
        int r1 = sc.nextInt();
         System.out.print("Range2: ");
        int r2 = sc.nextInt();
        if(num1>=r1 && num1<=r2){
            System.out.println("Yes its in correct range");
        }else{
             System.out.print("Not its not in correct range");
        
        }

}
}
