public class Static_NonStatic_Variables {
    static String name = "manasa";

    int age = 20;
    public static void main(String args[]){
        System.out.println("name: "+Static_NonStatic_Variables.name);
        Static_NonStatic_Variables obj = new Static_NonStatic_Variables();
    System.out.println("Age: "+obj.age);    }

}
