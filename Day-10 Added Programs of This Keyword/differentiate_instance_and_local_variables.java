import java.util.Scanner;
class differentiate_instance_and_local_variables{
    String name;
    int age;
    String Branch;
    public differentiate_instance_and_local_variables() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Instance Varaible");
        System.out.print("Name: ");
        this.name = sc.nextLine();
        System.out.print("Age: ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.print("Branch: ");
        this.Branch = sc.nextLine();
        System.out.println("Name: "+name);
        System.out.println("age: "+age);
        System.out.println("branch: "+Branch);

       
    }

    void display(String name, int age, String branch) {

        System.out.println("\nInstance Variables");
        System.out.println("Name   : " + this.name);
        System.out.println("Age    : " + this.age);
        System.out.println("Branch : " + this.Branch);

        System.out.println("\nLocal Variables");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Branch : " + branch);
    }

     


   
    
    

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        differentiate_instance_and_local_variables obj = new differentiate_instance_and_local_variables();
        System.out.println("Local variables");
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Branch: ");
        String Branch = sc.nextLine();
        obj.display(name, age, Branch);
        
        
       
        

    }
}