import java.util.Scanner;

public class ReverseArray {
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
        System.out.print("Reverse of Array: ");
        for(int i=size-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
