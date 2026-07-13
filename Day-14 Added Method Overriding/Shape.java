import java.util.Scanner;
class Circle{
    int r;
    double pie = 3.14;
    void shape(){
        System.out.println("Area of reactangle: "+(pie*r*r));
    }
}
class Rectangle extends Circle{
    int l;
    int b;
    void dummy(){
        super.shape();
    }
     void shape(){
        System.out.println("Area of rectangle: "+l*b);

    }
   
}
class Shape{
    public static void main(String args[]){
        Rectangle r = new Rectangle();
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        r. r = sc.nextInt();
         System.out.print("Enter length: ");
       r. l = sc.nextInt();
        System.out.print("Enter breadth: ");
        r. b = sc.nextInt();
        r.shape();
        r.dummy();
    }
}
    

