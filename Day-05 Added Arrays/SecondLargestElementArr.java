import java.util.Scanner;

public class SecondLargestElementArr {
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
            int fir_largest = arr[0];
            int sec_largest = arr[0];
            for(int i=1;i<arr_size;i++){
              if(fir_largest<arr[i]){
                sec_largest = fir_largest;
                fir_largest = arr[i];
              }else if (arr[i] > sec_largest && arr[i] != fir_largest) {
                sec_largest = arr[i];
              }
        }
        System.out.println("Second Largest Element : "+sec_largest);
}
}
