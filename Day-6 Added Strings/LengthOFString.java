import java.util.Scanner;
class LengthOFString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int length_of_String = str.length();
        System.out.println("Length of String " +str+ " is : "+length_of_String);
    }
}