/*
 * Decompiled with CFR 0.152.
 */
import java.util.Scanner;

public class CallParentConstructor {
    public static void main(String[] stringArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ram1: ");
        int n = scanner.nextInt();
        System.out.println("Storage: ");
        int n2 = scanner.nextInt();
        System.out.println("Cam quailty:  ");
        int n3 = scanner.nextInt();
        Samsung samsung = new Samsung(n, n2, n3);
        System.out.println("Enter parent's ram: ");
        ((Phone)samsung).ram = scanner.nextInt();
        System.out.println("Enter parent's storage: ");
        ((Phone)samsung).storage = scanner.nextInt();
        samsung.access_parent_method();
        samsung.phone();
    }
}
