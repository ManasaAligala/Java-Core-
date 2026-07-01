
import java.util.Scanner;
public class SumOfFirstnNaturalNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for(i=0;i<=n;i++){
            sum += i;

        }
        System.out.println("sum of natural nums: "+sum);
    }
}
