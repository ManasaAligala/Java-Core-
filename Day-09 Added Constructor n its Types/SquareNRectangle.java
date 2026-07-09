import java.util.Scanner;
class SquareNRectangle{
 int side;
 int length;
 int breadth;
 int area;
 int area1;
 SquareNRectangle(int side){
    this.side = side;
    area = side*side;
    

 }
 SquareNRectangle(int length,int breadth){
    this.length = length;
    this.breadth = breadth;
    area1 = length*breadth;
}
void area(){
    System.out.println("Area of square: "+area);
    System.out.println("Area of rectangle: "+area1);
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter side: ");
    int side = sc.nextInt();
    System.out.println("Enter length: ");
    int length = sc.nextInt();
    System.out.println("Enter breadth: ");
    int breadth = sc.nextInt();
    SquareNRectangle obj = new SquareNRectangle(side);
    SquareNRectangle obj1 = new SquareNRectangle(length, breadth);
    obj1.area();
    obj.area();
}
 
}
