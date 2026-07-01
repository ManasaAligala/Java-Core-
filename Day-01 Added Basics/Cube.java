
import java.util.Scanner;
public class Cube {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter number: ");
         int num = sc.nextInt();
         int cube = num*num*num;
         System.out.println("cube of " + num+ " is: "+cube);

    }
   
    

}
