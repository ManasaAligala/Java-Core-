import java.util.Scanner;

public class PrintingPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter another number: ");
        int n2 = sc.nextInt();
        
        for(int i=n1;i<=n2;i++){
            if(i<=1){
                continue;
            }
            //int dig = 0;
            boolean isprime = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isprime = false;
                    break;

                }
                
            }
        
            if(isprime==true){
                    System.out.print(i);
                
                }
        
    }
            
        }

    }

