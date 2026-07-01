import java.util.Scanner;
public class RemovingSpacesFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        str = str.replace(" ","");
        System.out.println("After removing spaces from String: "+str);
    }
}
