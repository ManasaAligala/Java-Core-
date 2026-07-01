import java.util.Scanner;
public class CountVowelsOrConsonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String str1 = "AEIOUaeiou";
       int vowel = 0;
       
       boolean isvowel = false;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str1.length();j++){
                if(str.charAt(i)==str1.charAt(j)){
                    vowel++;
                    break;
                }
            }
        }
        
        System.out.println("Vowels Count: "+vowel);
        int conso = vowel-str.length();
        System.out.println("Consonents count: "+conso);

        
    }
}
