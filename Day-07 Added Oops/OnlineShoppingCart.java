import java.util.Scanner;
public class OnlineShoppingCart {
    int Product_id;
    String Product_Name;
    String Brand_name;
    long Price;
    int Quantity;
    int Discount;
    long bill;
    long dis_amount;
    long fin_bill;
    OnlineShoppingCart(String Product_name){
        this.Product_Name = Product_name;
    }
    OnlineShoppingCart(String Product_name, long Price){
        this.Product_Name = Product_name;
        this.Price = Price;
    }
    OnlineShoppingCart(String Product_name, long Price,int Quantity){
        this.Product_Name = Product_name;
        this.Price = Price;
        this.Quantity = Quantity;
    }
    OnlineShoppingCart(String Product_name, long Price,int Quantity,String Brand_name){
        this.Product_Name = Product_name;
        this.Price = Price;
        this.Quantity= Quantity;
        this.Brand_name = Brand_name;
    }
    OnlineShoppingCart(int Product_id,String Product_name, long Price,int Quantity,String Brand_name,int Discount){
        this.Product_Name = Product_name;
        this.Price = Price;
        this.Product_id = Product_id;
        this.Quantity= Quantity;
        this.Brand_name = Brand_name;
        this.Discount = Discount;

    }

    void displayProduct(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Product Details" );
        System.out.println("Product name : "+Product_Name);
        
        System.out.println("Product id :"+Product_id);
      
        System.out.println("Product brand_name :"+Brand_name);
       
        System.out.println("Product prices :"+Price);
   
        System.out.println("Product quantity :"+Quantity);
        
        System.out.println("Product discount :"+Discount);
        
    }
    void calculatebill(){
        bill = Price*Quantity;
        System.out.println(" ");
        System.out.println("Bill : "+bill);

    }
    void DiscountCal(){
        dis_amount = (bill * Discount)/100;
        System.out.println("You saved amount : "+dis_amount);
        fin_bill = bill-dis_amount;
        System.out.println(" ");
        System.out.println("Total bill: "+fin_bill);
    }
     

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Product name : ");
        String Product_Name = sc.nextLine();
        System.out.print("Product id :");
        int Product_id = sc.nextInt();
        sc.nextLine();
        System.out.print("Product brand_name :");
        String Brand_name = sc.nextLine();
        System.out.print("Product prices :");
        long Price = sc.nextLong();
        System.out.print("Product quantity :");
        int Quantity = sc.nextInt();
        System.out.print("Product discount :");
        int Discount = sc.nextInt();
        

        OnlineShoppingCart obj1 = new OnlineShoppingCart(Product_id, Product_Name, Price, Quantity, Brand_name, Discount);
        obj1.displayProduct();

       OnlineShoppingCart obj2 = new OnlineShoppingCart(Product_Name, Price, Quantity);
       obj1.calculatebill();
       obj1.DiscountCal();


        
    }

}
