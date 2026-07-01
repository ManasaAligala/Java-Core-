import java.util.Arrays;
import java.util.Scanner;
public class AscendingSortArray {
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
        System.out.println("Elements sorted in ascending Order are: "+Arrays.toString(arr));


    }

}
