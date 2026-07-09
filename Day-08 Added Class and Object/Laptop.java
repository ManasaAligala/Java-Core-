import java.util.Scanner;

public class Laptop {
    String Company;
   String Processor;
   int ram;

   Laptop(String Company, String Processor, int ram) {
      this.Company = Company;
      this.Processor = Processor;
      this.ram = ram;
   }

   void ShowBook() {
      System.out.println("");
      System.out.println("");
      System.out.println("Laptop Details");
      System.out.println("Author: " + this.Company);
      System.out.println("Title: " + this.Processor);
      System.out.println("Price: " + this.ram);
   }

   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Company: ");
      String  Company = sc.nextLine();
      System.out.print("Processor: ");
      String Processor = sc.nextLine();
      System.out.print("ram: ");
      int ram = sc.nextInt();
      Laptop obj = new Laptop(Company, Processor, ram);
      obj.ShowBook();
   }
}
