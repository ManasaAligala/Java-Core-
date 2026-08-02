import java.util.Scanner;
interface Shape{
    void area();

}
class Circle implements Shape{

    public void area() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        double area = 3.14 * radius * radius;

        System.out.println("Area of Circle: " + area);
    }


}
class Rectangle implements Shape{
    public void area(){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter length: ");
      int length = sc.nextInt();
      System.out.print("Enter breadth: ");
      int breadth = sc.nextInt();
      System.out.println("Area of Rectangle: "+length*breadth);

    }

}

public class ShapeDemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        c.area();
        r.area();


        



    }
    
}
