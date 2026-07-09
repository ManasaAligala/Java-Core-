import java.util.Scanner;
class Plants{
    String color = "Green";
    void Photosynthesis(){
        System.out.println("All plants perform photo synthesis");
    }
    Plants(String color){
        this.color = color;
    }
}
class Derma extends Plants{
    String color = "violet";
    Derma(String color) {
        super(color);
        this.color = color;
    }
    
    void Photosynthesis(){
        System.out.println("Derma prepares food through another process");
    }
    void dummy(){
        super.Photosynthesis();
    }

}
public class ConstructorChaining {
    public static void main(String args[]){

    Derma d = new Derma("derma");
    System.out.println(d.color);
    
    Plants p = d;
    System.out.println(p.color);
    d.dummy();
    d.Photosynthesis();
    
    }
}
