/*
 * Decompiled with CFR 0.152.
 */
import java.util.Scanner;

class DefaultConstructor {
    String name;

    public DefaultConstructor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student name: ");
        this.name = scanner.nextLine();
    }

    void display() {
        System.out.println("Default Constructor implemented");
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] stringArray) {
        DefaultConstructor defaultConstructor = new DefaultConstructor();
        defaultConstructor.display();
    }
}
