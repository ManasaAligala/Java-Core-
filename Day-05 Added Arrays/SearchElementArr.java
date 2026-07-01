import java.util.Scanner;

public class SearchElementArr {
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
        System.out.print("Enter the Element to search: ");
        int target = sc.nextInt();
        for(int i=0;i<size;i++){
            if(target==arr[i]){
                System.out.println("found");
            }else{
                System.out.println("No found ");
            }
        }

}
}
