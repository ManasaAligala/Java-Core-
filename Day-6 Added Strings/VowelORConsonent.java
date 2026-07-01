import java.util.Scanner;
public class VowelORConsonent{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);
        boolean Vowel = true;
        String str = "AEIOUaeiou";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                Vowel = false;
               
            }
             break;
        }
        if(Vowel==true){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonent");
        }


    }
}
