import java.util.Scanner;

class Test1 {

    String name;

    
    public Test1(Test2 t2) {
        System.out.println("Age: " + t2.age);
    }
}

class Test2 {

    int age;

    public Test2(int age) {
        
        this.age = age;

        Test1 t1 = new Test1(this);
    }
}

class PassCurrentObjToConstructor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Test2 t2 = new Test2(age);

        sc.close();
    }
}
