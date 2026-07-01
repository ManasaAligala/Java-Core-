import java.util.Scanner;
public class SmallestElementArr {
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
        int smallest = arr[0];
        for(int i=0;i<size;i++){
            if(smallest>arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest element in the array is : "+smallest);


        

    }
}
