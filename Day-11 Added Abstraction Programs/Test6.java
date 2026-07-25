import java.util.Scanner;
abstract class Person{
   abstract void displayRole();
}
class Student extends Person{
    void displayRole(){
        System.out.println("Role: Student ");
    }
    void displayDetails(String S_name, int S_age){
        System.out.println("Name: "+S_name);
        System.out.println("Age: "+S_age);

    }

}
class Teacher extends Person{
    void displayRole(){
         System.out.println("Role: Teacher");
    }
    void displayDetails(String t_name, int t_age){
        System.out.println("Name: "+t_name);
        System.out.println("Age: "+t_age);

    }
    

}
class Doctor extends Person{
    void displayRole(){
         System.out.println("Role: Doctor");

    }
   void displayDetails(String d_name, int d_age){
        System.out.println("Name: "+d_name);
        System.out.println("Age: "+d_age);

    }

}

public class Test6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.print("Name: ");
         String S_name = sc.nextLine();
         System.out.print("Age: ");
         int S_age = sc.nextInt();
         sc.nextLine();
         
         System.out.print("Name: ");
         String t_name = sc.nextLine();
         System.out.print("Age: ");
         int t_age = sc.nextInt();
          sc.nextLine();
         
         System.out.print("Name: ");
         String d_name = sc.nextLine();
         System.out.print("Age: ");
         int d_age = sc.nextInt();

         Student s = new Student();
         s.displayDetails(S_name,S_age);
         s.displayRole();
         Teacher t = new Teacher();
         t.displayDetails(t_name,t_age);
         t.displayRole();
         Doctor d = new Doctor();
         d.displayDetails(d_name,d_age);
         d.displayRole();





    }
    
}

