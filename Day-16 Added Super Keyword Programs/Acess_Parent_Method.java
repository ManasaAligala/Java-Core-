class Animal{
    void sound(){
        System.out.println("Animals makes sounds");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog bars");
    }
    void dubby(){
        super.sound();
    }

}
public class Acess_Parent_Method {
    public static void main(String args[]){

    
    Dog d = new Dog();
    d.dubby();
    d.sound();
    }

    
}
