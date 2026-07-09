import java.util.Scanner;
class Student{
    String name;
    String branch;
    int rollno;
    Student(String name,String branch,int rollno){
        this.name = name;
        this.branch = branch;
        this.rollno = rollno;

    }
    void display(){
        System.out.println("");
        System.out.println("");
        System.out.println("Displaying Details");
        System.out.println("Student Name: "+name);
        System.out.println("Student Branch: "+branch);
        System.out.println("Student Rollno: "+rollno);
    }


     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name= sc.nextLine();
        System.out.print("Enter branch:  ");
        String branch = sc.nextLine();
        System.out.print("Enter rollno: ");
        int rollno = sc.nextInt();
        Student obj = new Student(name,branch,rollno);
        obj.display();

     }
}