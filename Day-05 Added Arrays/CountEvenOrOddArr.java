import java.util.Scanner;

public class CountEvenOrOddArr {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter element into the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("");
        System.out.print("Elements in the array are: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println("");
        int even_count = 0;
        int odd_count = 0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                even_count++;
            }else{
                odd_count++;
            }
        }
        System.out.println("    Even Count : "+even_count);
        System.out.println("Odd Count : "+odd_count);
}
}
