abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    @Override void sound(){
        System.out.println("Dogs bark");

    }

}
class Cat extends Animal{
    @Override void sound(){
         System.out.println("Cat makes sound");
    }

}
class Cow extends Animal{
    @Override void sound(){
         System.out.println("Cow makes sound");
    }
    
}
public class Test2{
    public static void main(String args[]){
        Dog d = new Dog();
        d.sound();
        Cow c = new Cow();
        c.sound();
        Cat ca = new Cat();
        ca.sound();



    }
}