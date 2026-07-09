import java.util.Scanner;
public class Student {
    String name;
    int rollno;
    int year;
    String branch;
    public Student(String name,int rollno,int year,String branch){
            this.name = name;
           this.rollno =  rollno;
            this.year = year;
             this.branch =branch ;

    }
    void details(){
        System.out.println("Student Details");
        System.out.println("Name: "+name);
         System.out.println("Rollno: "+rollno);
          System.out.println("Year: "+year);
           System.out.println("Branch: "+branch);
           
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.print("Enter Rollno:  ");
        int rollno = sc.nextInt();
        System.out.print("Enter year:  ");
        int year = sc.nextInt();
     
        System.out.print("Enter branch: ");
        String branch = sc.nextLine();
        sc.nextLine();

        System.out.println(" ");

        Student obj = new Student(name,rollno,year,branch);
        obj.details();
        

    }
}
