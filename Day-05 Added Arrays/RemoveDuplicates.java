import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arr_size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
           System.out.print("Enter elements into the array: "); 
           arr[i] = sc.nextInt();
        }
        System.out.println(" ");
        System.out.print("Elements in the array are : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println(" ");
        
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                   for(int k=j;k<n-1;k++){
                     arr[k] = arr[k+1];
                   }
                   n--;
                   j--;
                }
            }
        }
        System.out.print("After removing duplicate elements : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

     }
}
