import java.util.Scanner;
class BookWithMultipleConstructors{
String B_name;
int publish_year;
String author;
int cost;
    public BookWithMultipleConstructors() {
        
        System.out.println("Book with multiple Parameters");
        System.out.println("-------------------------");
        System.out.println("Default Constructor: ");
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Book name: ");
        B_name = sc.nextLine();
        System.out.println("Enter published year: ");
        publish_year = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter author name: ");
        author = sc.nextLine();
        System.out.println("-------------------------");
        
    }

    public BookWithMultipleConstructors(String B_name, int publish_year, String author,int cost) {
        
        this.B_name = B_name;
        this.publish_year = publish_year;
        this.author = author;
        this.cost = cost;
        
        System.out.println("Parameterized Constructor");
        System.out.println("---------------------------");
    }
    
    void show(){
        System.out.println("Displaying book Details: ");
        System.out.println("Name: "+B_name);
        System.out.println("Publish year: "+publish_year);
        System.out.println("Author name: "+author);
        System.out.println("Cost : "+cost);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
             System.out.println("Enter cost: ");
             int cost = sc.nextInt();
            BookWithMultipleConstructors obj = new BookWithMultipleConstructors();
             BookWithMultipleConstructors obj1 = new BookWithMultipleConstructors(obj.B_name,obj.publish_year,obj.author,cost);
             obj1.show();
             obj.show();
       


    }
    
}