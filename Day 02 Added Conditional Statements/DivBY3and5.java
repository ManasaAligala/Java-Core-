import java.util.Scanner;

public class DivBY3and5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        int num = sc.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("Div by Both");
        }else{
            System.out.println("not Div by Both");
        }
}
}
