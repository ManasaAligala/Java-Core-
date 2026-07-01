import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number : ");
        String str = sc.nextLine();
        String rev = "";
        int i=0;
        for(i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
      //  System.out.println("str rev: "+rev);
      if(str.equals(rev)){
        System.out.println("Palindrome");
      }else{
        System.out.println("Not Palindrome");
      }

    }
}
