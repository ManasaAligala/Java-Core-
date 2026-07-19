import java.util.Scanner;
class Student{
   private int studentId ;
   private String name; 
    private int age;
    private String branch;
    public void setstudentId(int studentId){
        this.studentId = studentId;
    }
    public int getstudentId(){
        return studentId;
    }
    public void setname(String name){
        this.name = name;

    }
    public String getname(){
        return name;
    }
    public void setAge(int age){
        if(age>=16 && age<=35){
            this.age = age;
        }else{
            System.out.println("Age should be in between 16 and 35");
        }
    }
    public int getAge(){
        return age;
    }
    public void setBranch(String branch){
        this.branch = branch;
    }
    public String getBranch(){
        return branch;
    }
    void displayDetails(){
        System.out.println("Name: "+getname());
        System.out.println("age: "+getAge());
        System.out.println("Id: "+getstudentId());
        System.out.println("Branch: "+getBranch());
       // System.out.println("age: ");
    }
   

    public static void main(String args[]){
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Student ID: ");
        s.setstudentId(sc.nextInt());
        sc.nextLine();
        System.out.println("Name: ");
        s.setname(sc.nextLine());
       
        System.out.println("Age: ");
        s.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Branch: ");
        s.setBranch(sc.nextLine());
        s.displayDetails();
        

    }
}