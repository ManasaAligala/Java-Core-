class Puppy{
    String name = "puppy_tommy";

}
class Dog extends Puppy{
    String name = "Dog_tommy";
    void display(){
        System.out.println("Displaying details of puppy and dog");
        System.out.println("puppy name: "+super.name);
         System.out.println("Dog name: "+this.name);

    }

}
public class This_n_Super {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
    
}
