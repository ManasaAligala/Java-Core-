/*
 * Decompiled with CFR 0.152.
 */
import java.util.Scanner;

public class ConstructorOverloading {
    String name;
    int age;
    float height;

    ConstructorOverloading() {
        System.out.println("Default Constructor");
    }

    ConstructorOverloading(String string) {
        this.name = string;
        System.out.println("Name: " + string);
        System.out.println("Single Paramterized Constructor");
    }

    ConstructorOverloading(int n, float f) {
        this.age = n;
        this.height = f;
        System.out.println("Age: " + n);
        System.out.println("Height: " + f);
        System.out.println("Double Paramterized Constructor");
    }

    public static void main(String[] stringArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String string = scanner.nextLine();
        System.out.println("Enter age: ");
        int n = scanner.nextInt();
        System.out.println("Enter height: ");
        float f = scanner.nextFloat();
        ConstructorOverloading constructorOverloading = new ConstructorOverloading();
        ConstructorOverloading constructorOverloading2 = new ConstructorOverloading(string);
        ConstructorOverloading constructorOverloading3 = new ConstructorOverloading(n, f);
    }
}
