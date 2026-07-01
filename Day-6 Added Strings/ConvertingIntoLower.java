import java.util.Scanner;

public class ConvertingIntoLower {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.println("Coverted into LowerCase: "+str);

}
}
