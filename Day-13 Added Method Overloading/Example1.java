/*
 * Decompiled with CFR 0.152.
 */
import java.util.Scanner;

class Example1 {
    int a;
    int b;

    Example1() {
    }

    int add(int n, int n2) {
        return n + n2;
    }

    int add(int n, int n2, int n3) {
        return n + n2 + n3;
    }

    double add(double d, double d2) {
        return d + d2;
    }

    public static void main(String[] stringArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int n = scanner.nextInt();
        System.out.println("Enter b: ");
        int n2 = scanner.nextInt();
        System.out.println("Enter b: ");
        int n3 = scanner.nextInt();
        System.out.println("Num1: ");
        double d = scanner.nextDouble();
        System.out.println("num2: ");
        double d2 = scanner.nextDouble();
        Example1 example1 = new Example1();
        System.out.println(example1.add(n, n2));
        System.out.println(example1.add(n, n2, n3));
        System.out.println(example1.add(d, d2));
    }
}
