/*
 * Decompiled with CFR 0.152.
 */
import java.util.Scanner;

public class ParameterizedConstructor {
    String name;
    int age;
    int id;

    public ParameterizedConstructor(String string, int n, int n2) {
        this.name = string;
        this.id = n;
        this.age = n2;
    }

    void show() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.id);
    }

    public static void main(String[] stringArray) {
        Scanner scanner = new Scanner(System.in);
        ParameterizedConstructor parameterizedConstructor = new ParameterizedConstructor("", 0, 0);
        System.out.print("Enter name: ");
        parameterizedConstructor.name = scanner.nextLine();
        System.out.print("Enter age: ");
        parameterizedConstructor.age = scanner.nextInt();
        System.out.print("Enter id: ");
        parameterizedConstructor.id = scanner.nextInt();
        parameterizedConstructor.show();
    }
}
