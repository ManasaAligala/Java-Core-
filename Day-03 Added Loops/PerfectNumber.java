import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();
        int i=1;
        int count = 0;
        for(i=1;i<num;i++){
            if(num%i==0){
            count += i;
            }
        }
        if(count==num){
            System.out.println("Its a perfect number");
        }else{
            System.out.println("No Its not a perfect number");
        }
        
        
    }
}
