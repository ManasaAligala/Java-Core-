import java.util.Scanner;
public class Product {
    private int productId;
    private String productName;
    private int price;
    private int quantity;
    private String category;
    int total=0;

    public void setproductId(int productId){
        if(productId>0){
        this.productId = productId;
        }else{
            System.out.println("Product Id cant be negative");
        }


    }
    public void setproductName(String productName){
        if(productName.isEmpty()){
            System.out.println("Product name cant be empty");
        }else{
            this.productName = productName;
        }
        
    }
    public void setPrice(int price){
        if(price>0){
            this.price = price;
        }else{
            System.out.println("Price cant be empty");
        }
        
    }
    public void setQuantity(int quantity){
        if(quantity<0){
            System.out.println("Quantity cant be negative");
        }else{
            this.quantity = quantity;
        }
        
    }
    public void setCategory(String category){
        if(category.equalsIgnoreCase("Electronics")){
            this.category = category;
        }else if(category.equalsIgnoreCase("Clothing")){
            this.category = category;
        }else if(category.equalsIgnoreCase("Books")){
            this.category = category;
        }else if(category.equalsIgnoreCase("Groceries")){
            this.category = category;
        }else{
            this.category = "Invalid Category";
        }



        }
        
    
    public int getproductId(){
        return productId;
    }
    public String getproductName(){
        return productName;
        
    }
    public int getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getCategory(){
        return category;
        }
        
    

    int calculateTotalPrice(){
        return price*quantity;
       // System.out.println("total Price: "+total);
    }


    void displayProduct(){
        System.out.println("------ Product Details ------");
        System.out.println("Product ID :"+getproductId());
        System.out.println("Product Name :"+getproductName());
        System.out.println("Category :"+getCategory());
        System.out.println("Price :"+getPrice());
        System.out.println("Quantity :"+getQuantity());
        System.out.println("Total Price :"+calculateTotalPrice());
    }




    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        System.out.println("Enter Id: ");
        p.setproductId(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter name: ");
        p.setproductName(sc.nextLine());

        System.out.println("Enter price: ");
        p.setPrice(sc.nextInt());
        System.out.println("Enter quantity: ");
        p.setQuantity(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter category: ");
        p.setCategory(sc.nextLine());
        p.displayProduct();
        p.calculateTotalPrice();
    }
    
}
