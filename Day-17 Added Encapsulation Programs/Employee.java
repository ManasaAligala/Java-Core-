import java.util.Scanner;
class Employee {
   private String name;
   private int id;
    private String role;
    private double salary;
    private String com_name;
    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
    public void setid(int id){
        this.id = id;
    }
    public int getid(){
        return id;
    }
    public void setrole(String role){
        this.role = role;
    }
    public String getrole(){
        return role;
    }
    public void setsalary(double salary){
        this.salary = salary;
    }
    public double getsalary(){
        return salary;
    }
    public void setcom_name(String com_name){
        this.com_name = com_name;
    }
    public String getcom_name(){
        return com_name;
    }
    void display_Employee(){
        System.out.println("Name: "+getname());
        System.out.println("ID: "+getid());
        System.out.println("Designation: "+getrole());
        System.out.println("salary: "+getsalary());
        System.out.println("company name: "+getcom_name());
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        System.out.print("Enter name: ");
        e.setname(sc.nextLine());

        System.out.print("Enter id: ");
        e.setid(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter role: ");
        e.setrole(sc.nextLine());
        System.out.print("Enter salary: ");
        e.setsalary(sc.nextDouble());
        sc.nextLine();
        System.out.print("Enter company name: ");
        e.setcom_name(sc.nextLine());
        e.display_Employee();

    }
    
}
