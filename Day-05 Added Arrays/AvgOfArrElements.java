import java.util.Scanner;
public class AvgOfArrElements {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter elements into the array: ");
            arr[i] = sc.nextInt();
            }
            System.out.print("elements in the array: ");
            for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
           // arr[i] = sc.nextInt();
            }
            System.out.println("");
            int sum = 0;
            for(int i=0;i<size;i++){
               sum += (arr[i]);
            }
            int avg = sum/size;

            System.out.println("Avg of arr: "+avg);

    }
}
