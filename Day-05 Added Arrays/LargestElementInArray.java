import java.util.Scanner;
public class LargestElementInArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter elements into the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Elements in the array are : ");
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");

        }
        System.out.println(" ");
        //System.out.println("Largest element in the array is: ");
        int largest = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            
        }
        System.out.println("Largest element : "+largest);

    }
}
