/*
 * Decompiled with CFR 0.152.
 */
import java.util.Scanner;

class Acess_ParentVariable {
    Acess_ParentVariable() {
    }

    public static void main(String[] stringArray) {
        Scanner scanner = new Scanner(System.in);
        Child child = new Child();
        System.out.print("Enter Parent Name: ");
        ((Parent)child).name = scanner.nextLine();
        System.out.print("Enter child Name: ");
        child.name = scanner.nextLine();
        child.display();
        Acess_ParentVariable acess_ParentVariable = new Acess_ParentVariable();
    }
}
