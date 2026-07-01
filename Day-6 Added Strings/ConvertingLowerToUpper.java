import java.util.Scanner;
public class ConvertingLowerToUpper {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        str = str.toUpperCase();
        System.out.println("Coverted into UpperCase: "+str);

    }
}
