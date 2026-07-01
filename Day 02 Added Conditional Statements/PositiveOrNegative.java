import java.util.Scanner;
class PositiveOrNegative{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        if(number>0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
}