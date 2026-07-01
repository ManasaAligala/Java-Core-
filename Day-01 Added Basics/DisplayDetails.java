public class DisplayDetails {
    String name;
    int age;
    String college;
    public DisplayDetails(String name,int age,String college) {
        this.name = "manasa";
        this.age = 19;
        this.college = "Malla Reddy Engineering College for Women";
    }
    
    public static void main(String args[]){
        DisplayDetails obj = new DisplayDetails(null, 0,null);
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.college);

    }
}
