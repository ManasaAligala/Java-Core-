
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int r = sc.nextInt();
        double pie = 3.14;
       int   radius =  (int)pie*r*r;
       System.out.println("Radius : "+radius);
        


    }
}
