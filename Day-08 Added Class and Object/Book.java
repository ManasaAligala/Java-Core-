import java.util.Scanner;
public class Book {
    String title ,author;
    int price;
    Book(String title ,String author,int price){
         this.author= author;
         this.title= title;
         this.price= price;
    }
    void ShowBook(){
        System.out.println("");
        System.out.println("");
        System.out.println("Book Details");
        System.out.println("Author: "+author);
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Author: ");
        String author = sc.nextLine();
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Price: ");
        int Price = sc.nextInt();
        Book obj = new Book(title, author, Price);
        obj.ShowBook();
    }
}
