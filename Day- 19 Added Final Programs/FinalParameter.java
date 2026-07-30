import java.util.Scanner;
public class FinalParameter {
    int a;
    int b;
     FinalParameter(final int a,final int b){
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        FinalParameter p = new FinalParameter(a, b);



    }
    
}
