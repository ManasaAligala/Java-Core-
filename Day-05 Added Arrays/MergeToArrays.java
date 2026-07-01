import java.util.Scanner;

public class MergeToArrays {
     public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array1: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for(int i=0;i<size1;i++){
            System.out.print("Enter element into the array1: ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("");
        System.out.print("Elements in the array1 are: ");
        for(int i=0;i<size1;i++){
            System.out.print(arr1[i]+" ");
            
        }
        System.out.println("");
        System.out.print("Enter the size of array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for(int i=0;i<size2;i++){
            System.out.print("Enter element into the array2: ");
            arr2[i] = sc.nextInt();
        }
        System.out.println("");
        System.out.print("Elements in the array2 are: ");
        for(int i=0;i<size2;i++){
            System.out.print(arr2[i]+" ");
            
        }
        System.out.println("");
        int merged_arr_size = size1+size2;
        int[] merged_arr = new int[merged_arr_size];
        System.out.print("Merged Array: ");
        for(int i=0;i<size1;i++){
            merged_arr[i] = arr1[i];
            System.out.print(merged_arr[i]+" ");
        }
        merged_arr[size1] = arr2[0];
        for(int i=0;i<size2;i++){
                merged_arr[i] = arr2[i];
                System.out.print(merged_arr[i]+" ");
        }


}
}
