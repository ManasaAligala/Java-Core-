/*
 * Decompiled with CFR 0.152.
 */
public class LibraryBookManagementSystem {
    int bookId;
    String title;
    String author;
    double price;

    public LibraryBookManagementSystem() {
        this.bookId = 0;
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public LibraryBookManagementSystem(String string) {
        this.bookId = 0;
        this.title = string;
        this.author = "Unknown";
        this.price = 0.0;
    }

    public LibraryBookManagementSystem(String string, String string2) {
        this.bookId = 0;
        this.title = string;
        this.author = string2;
        this.price = 0.0;
    }

    public LibraryBookManagementSystem(String string, String string2, int n, int n2) {
        this.bookId = 12;
        this.title = "C Programming";
        this.author = "Denis ritchie";
        this.price = 1200.0;
    }

    void displayBook() {
        System.out.println("Book ID : " + this.bookId);
        System.out.println("Title   : " + this.title);
        System.out.println("Author  : " + this.author);
        System.out.println("Price   : " + this.price);
    }

    public static void main(String[] stringArray) {
        LibraryBookManagementSystem libraryBookManagementSystem = new LibraryBookManagementSystem();
        LibraryBookManagementSystem libraryBookManagementSystem2 = new LibraryBookManagementSystem("Helloworld");
        libraryBookManagementSystem2.displayBook();
        LibraryBookManagementSystem libraryBookManagementSystem3 = new LibraryBookManagementSystem("java Programming", "James Gosling");
        libraryBookManagementSystem3.displayBook();
        LibraryBookManagementSystem libraryBookManagementSystem4 = new LibraryBookManagementSystem("Way to Peace", "Mario", 238, 1200);
        libraryBookManagementSystem4.displayBook();
    }
}
