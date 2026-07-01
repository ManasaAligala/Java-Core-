import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();
        int area = length*breadth;
        System.out.println("Area of Rectangle: "+area);
    }
}
