import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String str = sc.nextLine();
        int n = str.length();
        int i=0;
        for(i=n-1;i>=0;i--){
            System.out.println(str.charAt(i));
        }
    }
}
