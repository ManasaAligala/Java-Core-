import java.util.Scanner;
 abstract class Shape {
    abstract void  calculateArea();
    
}
class Rectangle extends Shape{

    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    void  calculateArea(){
    System.out.println("Area of rectangle: "+length*breadth);
        
   }

    
    

}
class Triangle extends Shape{
    int base;
    int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    @Override
    
    void  calculateArea(){
        System.out.println("Area of triangle: "+(0.5*base*height));


    }

}
class Circle extends Shape{
    double radius;
    double pie = 3.14;

    public Circle(double radius,double pie) {
        this.radius = radius;
    }
    
    @Override
    void  calculateArea(){
        System.out.println("Area of traingle: "+pie*Math.pow(radius,2));

    }

}
class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("length: ");
        int length = sc.nextInt();
        System.out.println("Breadth: ");
        int breadth = sc.nextInt();
       Rectangle r = new Rectangle(length, breadth);
       r.calculateArea();
        
        System.out.print("Base: ");
        int base = sc.nextInt();
        System.out.print("Height: ");
        int height = sc.nextInt();
        Triangle t = new Triangle(base, height);
        t.calculateArea();
        System.out.print("radius: ");
        double radius = sc.nextDouble();
        Circle c = new Circle(radius, radius);
        c.calculateArea();
        
       
        
        
        
    }
}
