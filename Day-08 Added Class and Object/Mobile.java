import java.util.Scanner;

public class Mobile {
     String com_name;
   int version ;
   int ram;

   Mobile(String com_name, int version, int ram) {
      this.com_name = com_name;
      this.version = version;
      this.ram = ram;
   }

   void ShowMobile() {
      System.out.println("");
      System.out.println("");
      System.out.println("Mobile Details");
      System.out.println("Company name: " + this.com_name);
      System.out.println("version: " + this.version);
      System.out.println("ram: " + this.ram);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Company: ");
      String  com_name = sc.nextLine();
      System.out.print("version: ");
      int version = sc.nextInt();
      System.out.print("ram: ");
      int ram = sc.nextInt();
      Mobile obj = new Mobile(com_name, version, ram);
      obj.ShowMobile();
   }
}
