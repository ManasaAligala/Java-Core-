import java.util.Scanner;
public class CheckCharAphabetOrDigitOrSpeclChar {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character: ");
        char ch = sc.next().charAt(0);
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String str1 = "0123456789";
        if(str.contains(String.valueOf(ch))){
            System.out.println("Alphabet");
        }else if(str1.contains(String.valueOf(ch))){
            System.out.println("Digit");
        }else{
            System.out.println("Special Character");
        }
      

    }
    
}
