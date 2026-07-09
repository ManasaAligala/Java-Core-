import java.util.Scanner;
class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void displayPerson(){
        System.out.println("Student name: "+name);
         System.out.println("Student age: "+age);
    }

}
class Student extends Person{
    String branch;
    int rollno;
    Student(String name,int age,String branch, int rollno){
        super(name, age);
        this.branch = branch;
        this.rollno = rollno;
    }
    void displayStudent(){
        System.out.println("");
        System.out.println("");
       
        System.out.println("Student branch: "+branch);
        System.out.println("Student rollno: "+rollno);
        
    }
   
    

}
public class Inheritance  {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter rollno: ");
        int rollno = sc.nextInt();
        Student s = new Student(name,age,branch,rollno);
        s.displayPerson();
        s.displayStudent();
        
        
    
    }
}
