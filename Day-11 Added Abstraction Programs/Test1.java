import java.util.Scanner;
abstract  class Employee {
    String name;
    int id;
    int salary;

    public Employee(String name,int id,int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    abstract void calculateBonus();

    
}
class Developer extends Employee{

    public Developer(String name,int id,int salary) {
        super(name,id,salary);
    }

    
    
        void calculateBonus() {
        double bonus = salary * 0.10;

        System.out.println("Developer Name: " + name);
        System.out.println("Developer ID: " + id);
        System.out.println("Developer Bonus: " + bonus);
    }

    }



class Manager extends Employee{
     Manager(String name, int id, int salary) {
        super(name, id, salary);
    }

    @Override
    void calculateBonus() {
        double bonus = salary * 0.20;

        System.out.println("Manager Name: " + name);
        System.out.println("Manager ID: " + id);
        System.out.println("Manager Bonus: " + bonus);
    }

}
    class Test1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        String name;
        int id;
        int salary;
         
        System.out.println("Enter Developer name: ");
        name = sc.nextLine();
        System.out.println("Enter Developer id: ");
         id = sc.nextInt();
         sc.nextLine();
        System.out.println("Enter Developer salary: ");
        salary = sc.nextInt();
        sc.nextLine();
        Developer d = new Developer(name,id,salary);
        d.calculateBonus();

         System.out.println("Enter Manager name: ");
         name = sc.nextLine();
        System.out.println("Enter Manager id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Manager salary: ");
        salary = sc.nextInt();
        Manager m = new Manager(name,id,salary);
        m.calculateBonus();

        

    }
}

