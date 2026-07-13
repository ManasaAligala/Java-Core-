 class Employee{
    void work(){
        System.out.println("Employee is working");
    }
} 
class Manager extends Employee{
    void s(){
        super.work();
    }
    void work(){
        System.out.println("Manager manages the team");
    }
}
class Employee_Manager{
    public static void main(String args[]){
        Manager m = new Manager();
        m.work();
        m.s();

    }

}