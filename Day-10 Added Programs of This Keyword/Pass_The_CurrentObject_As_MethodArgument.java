import java.util.Scanner;
public class Pass_The_CurrentObject_As_MethodArgument{
    String name;

    public Pass_The_CurrentObject_As_MethodArgument(String name) {
        this.name = name;

    }
    void display(Pass_The_CurrentObject_As_MethodArgument p){
        System.out.println(p.name);
    }
    void sendObject() {
        display(this);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        Pass_The_CurrentObject_As_MethodArgument obj = new Pass_The_CurrentObject_As_MethodArgument(name);
        obj.display(obj);

    }
    
    
}
