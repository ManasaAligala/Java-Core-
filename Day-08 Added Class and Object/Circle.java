import java.util.Scanner;
public class Circle {
    double radius;
    double pie = 3.14;
    double area;
    double diameter;
    double circumference;
    Circle(double  radius){
        this.radius = radius;
        //this.pie = pie;
    }
    void PrintArea(){
        area = pie*radius*radius;
        System.out.println("");
        System.out.println("Area of circle: "+area);
    }
    void printCircumference(){
        //diameter = radius*radius;
        circumference = 2*pie*radius;
        System.out.println("");
        System.out.println("Circumference: "+circumference);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        Circle obj = new Circle(radius);
        obj.PrintArea();
        obj.printCircumference();
       
    }
}
