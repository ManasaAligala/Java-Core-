public class Equals {
    public static void main(String[] args) {
        Equals e = new Equals();
        Equals e1 = new Equals();
        if(e==e1){
            System.out.println("References are equal");
        }else{
            System.out.println("References are not always equal");
        }
    }
}
