import java.util.Scanner;
public class ObjDetailsUsingThis {
    String name ;
    int age;

    public ObjDetailsUsingThis(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void show(){
        System.out.println("");
        System.out.println("Displaying details: ");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        ObjDetailsUsingThis obj = new ObjDetailsUsingThis(name, age);
        obj.show();

    }
    
}
