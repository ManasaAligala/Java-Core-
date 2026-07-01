import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();
        int i=2;
        boolean isPrime = true;
        for(i=2;i<num;i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println("Yes Its a prime");
        }else{
            System.out.println("No its not a prime");
        }
        
        }


    }

