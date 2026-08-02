import java.util.Scanner;
interface Calculater{
    void add(int a,int b);
     void subtract(int a, int b);
    void multiply(int a, int b);
    void divide(int a, int b);
}
class Simplecalci implements Calculater{
   public  void add(int a,int b){
       System.out.println("Addition: "+(a+b));
    }
    public  void subtract(int a,int b){
       System.out.println("Subtraction: "+(a-b));
    }
    public  void multiply(int a,int b){
       System.out.println("Multiply: "+(a*b));
    }
    public  void divide(int a,int b){
         if (b == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            double result = (double) a / b;
            System.out.println("Division: " + result);
        }
    }
}

public class CalculateDemo {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println();
        Simplecalci s = new Simplecalci();
        s.add(a, b);
        s.subtract(a, b);
        s.divide(a, b);
        s.multiply(a, b);

        }
    }
    

