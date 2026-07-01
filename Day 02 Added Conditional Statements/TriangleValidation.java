import java.util.Scanner;
public class TriangleValidation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        int a = sc.nextInt();
        System.out.print("Enter side2: ");
        int b = sc.nextInt();
        System.out.print("Enter side3: ");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b){
                System.out.println("Can from triangle");
        }else{
            System.out.println("Cant form the triangle");
        }

}
}
