import java.util.Scanner;
public class Rectangle {
    int length;
    int breadth;
    int area;

    public Rectangle(int length,int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void areaofRec(){
        area = length*breadth;
        System.out.println("");
        System.out.println("");
        System.out.println("length: "+length);
        System.out.println("Breadth: "+breadth);
        System.out.println("Area of Rectangle: "+area);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length: ");
        int length = sc.nextInt();
        System.out.print("breadth: ");
        int breadth = sc.nextInt();
        Rectangle obj = new Rectangle(length, breadth);
        obj.areaofRec();

    }
}
