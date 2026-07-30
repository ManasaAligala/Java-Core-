interface animal{
    void eat();
    void sleep();

}
class AnimalDemo implements animal{
    public void eat(){
            System.out.println("Animals do eat");
        }
        public void sleep(){
            System.out.println("Animals do sleep");
        }
    public static void main(String args[]){
     AnimalDemo a = new AnimalDemo();
     a.eat();
     a.sleep();
        
        
        
    }
}