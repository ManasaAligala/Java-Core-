import java.util.Arrays;
import java.util.Scanner;

public class DescendingSortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arr_size = sc.nextInt();
        int[] arr = new int[arr_size];
        for(int i=0;i<arr_size;i++){
            System.out.print("Enter elements into the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(" ");
        System.out.print("Elements int the array are: ");
        for(int i=0;i<arr_size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        Arrays.sort(arr);
        System.out.print("Elements in descending order are: ");
        for(int i=arr_size-1;i>=0;i--){
                System.out.print(arr[i]+" ");
        }



    }
}
