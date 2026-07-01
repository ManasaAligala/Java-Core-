import java.util.Scanner;
public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String str1 = "";
        int i=0;
        int j = 0;
        for(i=0;i<str.length();i++){
            for(j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    str1 = str1+str.charAt(i);
                }
            }
        }
        System.out.println("Duplicate Characters: "+str1);


    }
}
