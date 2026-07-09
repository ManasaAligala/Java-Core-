/*
 * Decompiled with CFR 0.152.
 */
import java.util.Scanner;

class StudentInformationSystem {
    StudentInformationSystem() {
    }

    public static void main(String[] stringArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String string = scanner.nextLine();
        System.out.print("Enter age: ");
        int n = scanner.nextInt();
        System.out.print("Enter rollNo: ");
        int n2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter branch: ");
        String string2 = scanner.nextLine();
        Student student = new Student(string, n, n2, string2);
        student.displayPerson();
        student.displayStudent();
    }
}
