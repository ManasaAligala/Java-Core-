import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        String str_rev = "";
        
        for(int i=str.length()-1;i>=0;i--){
            str_rev = str_rev+str.charAt(i);
        }
        System.out.println("Reversed String: "+str_rev);
        boolean ispalindrome = true;
        for(int i=0;i<str.length();i++){
            
                if(str.charAt(i)!=str_rev.charAt(i)){
                     ispalindrome = false;
                }
            }
            if(ispalindrome==true){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not a Palindrome");
            }
        }
    }

