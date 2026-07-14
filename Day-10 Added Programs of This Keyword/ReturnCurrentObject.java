import java.util.Scanner;
public class ReturnCurrentObject {
    String name;

    public ReturnCurrentObject(String name) {
        this.name = name;
    }

    ReturnCurrentObject getObject() {
        return this;
    }
    void display(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        ReturnCurrentObject r = new ReturnCurrentObject(name);
        r.display();

    }
    
    
}
