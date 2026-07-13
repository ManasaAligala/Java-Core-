class Dog extends Animal{
  void animal(){
    System.out.println("Dog barks");
 }
}
class Cat extends Dog{
    void dummy(){
        super.animal();
    }
    @Override void animal(){
        System.out.println("Cat sounds meow");
    }
}
class Animal{
   public static void main(String args[]){
     Cat c = new Cat();
     c.animal();
     c.dummy();

   }
    
}