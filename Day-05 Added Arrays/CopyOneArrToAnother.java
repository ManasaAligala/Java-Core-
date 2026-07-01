import java.util.Scanner;
public class CopyOneArrToAnother {
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
        System.out.print("Elements in the array1 are: ");
        for(int i=0;i<arr_size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        int[] arr_2 = new int[arr_size];
        System.out.print("Elements in array2: ");
        for(int i=0;i<arr_size;i++){
            arr_2[i] = arr[i];
            System.out.print(arr_2[i]+" ");
        }
    }
}
