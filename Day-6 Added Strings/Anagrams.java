import java.util.Scanner;
public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str1 = sc.nextLine();
        System.out.print("Enter String2: ");
        String str2  = sc.nextLine();

        if(str1.length()!=str2.length()){
            System.out.println("Cant be anagrams");
        }else{
        
        for(int i=0;i<str1.length();i++){
            int freq = 0;
            int freq2 = 0;
            
            for(int j=0;j<str1.length();j++){
                if(str1.charAt(i)==str1.charAt(j)){
                    freq++;
                }
            }
            for(int j=0;j<str2.length();j++){
                if(str2.charAt(i)==str2.charAt(j)){
                    freq2++;
                }
            }
        
            if(freq!=freq2){
                System.out.println("Not Anagrams");
            }else{
                System.out.println("Anagrams");
            }

        }}
       
        
        

                }
            }
        
        

    

