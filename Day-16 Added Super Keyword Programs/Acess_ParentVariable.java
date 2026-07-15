import java.util.Scanner;
class Parent{
    String name;
    
}
class Child extends Parent{
    String name;
    void display(){
        System.out.println("Parent Variable: "+super.name);
        System.out.println("Child varaible: "+name);
    }
   
}
class Acess_ParentVariable{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Child c = new Child();
    System.out.print("Enter Parent Name: ");
    ((Parent)c).name = sc.nextLine();
    System.out.print("Enter child Name: ");
    c.name = sc.nextLine();
    c.display();
    
    Acess_ParentVariable a = new Acess_ParentVariable();
    }
    




}
