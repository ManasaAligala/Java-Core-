import java.util.Scanner;
public class FrequencyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array_size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter elements into the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("");
        System.out.print("Elements in the Array are: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<size;i++){
          int count=0;
            for(int j=0;j<size;j++){
                if(arr[i]==arr[j]){
                   count++;
                }
            }
             System.out.println("Frequency of element  "+arr[i]+":"+count);
        }
       
        /***System.out.println("Frequency of elements present in array: "+incre);
        System.out.println("Enter the element you want to find frequency: ");
        int count =0;
        int freq = sc.nextInt();
        for(int i=0;i<size;i++){
            if(freq == arr[i]){
                count++;
            }else{
                System.out.println("Element not found in array");
            }
        }
        System.out.println("Frequency: "+count);*///

    }
}
