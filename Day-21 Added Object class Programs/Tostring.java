import java.util.Scanner;
class Tostring{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Age: ");
        int age = sc.nextInt();
        Tostring s = new Tostring();
        System.out.println(s);
        System.out.println("Java converts the hash code to hexadecimal and prints something like:\n" +
                        "Student@2f92e0f4");

    }
}