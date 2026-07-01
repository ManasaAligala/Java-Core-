import java.util.Scanner;
public class SumOfArrayElements {
   public static void main(String args[]){ 
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int arr_size = sc.nextInt();
    int[] arr = new int[arr_size];
    int i=0;
    for( i=0;i<arr_size;i++){
        System.out.println("Enter array elements: ");
        arr[i] = sc.nextInt();

        
    }
    System.out.print("Array Elemets are : ");
    for(int j=0;j<arr_size;j++){
        System.out.print(arr[j]+" ");
        
    }
    System.out.println("");
    int sum = 0;
    for(int j=0;j<arr_size;j++){
         sum += arr[j];
        

    }
    System.out.println("Sum Of Array Elements are : "+sum);
   


    
    

}
}

