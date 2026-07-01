import java.util.Scanner;

public class FibanocciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();
        int a = 0,b=1;
        System.out.print("Fibanocci Series: "+a+","+b+",");
        int i=0;
        int next=0;
        for(i=2;i<=num;i++){
             next = a+b;
            a=b;
            b=next;
            System.out.print(next+",");
        }
        //System.out.println(next+",");
        
        
    }
}
