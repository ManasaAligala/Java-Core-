import java.util.Scanner;
public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        int count = words.length;
        System.out.println("Number of words in the sentence is: "+count);
    }
}
