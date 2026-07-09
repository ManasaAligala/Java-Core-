import java.util.Scanner;

public class maxUsingOverloading {
    int a,b;
    int num1,num2,num3;
    maxUsingOverloading(int a,int b){
        this.a=a;
        this.b=b;
    }
    maxUsingOverloading(int num1,int num2,int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    void display(){
        System.out.println("Max of a and b: "+Math.max(a, b));
        
    }
    void show(){
        System.out.println("min of a b and c "+Math.min(num3,(Math.min(num1, num2))));
 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter num3 : ");
        int num3 = sc.nextInt();
        maxUsingOverloading obj1 = new maxUsingOverloading(a, b);
        maxUsingOverloading obj2 = new maxUsingOverloading(num1, num2, num3);
        obj1.display();
        obj2.show();
    }
}
