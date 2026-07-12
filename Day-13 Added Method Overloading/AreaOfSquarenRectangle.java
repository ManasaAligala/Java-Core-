import java.util.Scanner;
public class AreaOfSquarenRectangle {
    int area;
    int side;
    int l;
    int b;
    int area(int side){
        return side*side;
    }
    int area(int l,int b){
        return l*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side: ");
        int side = sc.nextInt();
         System.out.println("Enter length: ");
        int l = sc.nextInt();
        System.out.println("Enter Breadth: ");
        int b = sc.nextInt();
        //AreaOfSquarenRectangle obj1 = new AreaOfSquarenRectangle(side);
        //AreaOfSquarenRectangle obj2 = new AreaOfSquarenRectangle(l, b);
        AreaOfSquarenRectangle obj = new AreaOfSquarenRectangle();
        System.out.println(obj.area(side));
        System.out.println(obj.area(l, b));


    }
    
}
