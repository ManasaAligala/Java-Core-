import java.util.Scanner;
public class ReverseTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int length = str.length();
        int i=length-1;
        System.out.print("Reversed String: ");
        for( i=length-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
