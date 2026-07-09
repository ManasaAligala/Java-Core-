/*
 * Decompiled with CFR 0.152.
 */
import java.util.Scanner;

public class EmployeeInformationSystem {
    public static void main(String[] stringArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String string = scanner.nextLine();
        System.out.print("Age: ");
        int n = scanner.nextInt();
        System.out.print("Id: ");
        int n2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Designation: ");
        String string2 = scanner.nextLine();
        System.out.print("teamsize: ");
        int n3 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("projectName: ");
        String string3 = scanner.nextLine();
        System.out.print("bonus: ");
        double d = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("manager level: ");
        String string4 = scanner.nextLine();
        System.out.print("Experience level: ");
        int n4 = scanner.nextInt();
        System.out.print("Programming language: ");
        char c = scanner.next().charAt(0);
        Manager manager = new Manager(string, n, n2, string2, n3, string3, d, string4);
        Developer developer = new Developer(string, n, n2, string2, n3, string3, d, string4, n4, c);
        developer.displayPerson();
        developer.employeeDetails();
        developer.display_Developer();
        developer.display_Developer();
        developer.managerDetails();
    }
}
