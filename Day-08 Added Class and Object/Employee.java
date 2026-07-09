import java.util.Scanner;
public class Employee {
    String name;
    int id;
    int salary;
    Employee(String name,int id,int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void DisplayEmployee(){
    System.out.println("");
    System.out.println("");
    System.out.println("** Employee Details **");
    System.out.println("Employee name: "+name);
    System.out.println("Employee id: "+id);
    System.out.println("Employee salary: "+salary);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter id: ");
        int id = sc.nextInt();

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();
        Employee obj = new Employee(name, id, salary);
        obj.DisplayEmployee();


    }
}
