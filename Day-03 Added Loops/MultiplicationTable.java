import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        int result=1;
        for(int i=1;i<=10;i++){
           result = number*i;
           System.out.println(number+"X"+i+"="+result);
            
        }
    }
}
