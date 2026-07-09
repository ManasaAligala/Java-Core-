/*
 * Decompiled with CFR 0.152.
 */
import java.util.Scanner;

public class VehicleRentalManagementSystem_HirarchecalEx {
    public static void main(String[] stringArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Vehicle Number: ");
        long l = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Brand: ");
        String string = scanner.nextLine();
        System.out.print("rentalDays: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fuel type: ");
        String string2 = scanner.nextLine();
        System.out.print("Price per day: ");
        double d = scanner.nextDouble();
        System.out.print("Engine Capacity: ");
        int n2 = scanner.nextInt();
        System.out.print("Is helmet there: ");
        boolean bl = scanner.nextBoolean();
        Car car = new Car(l, string, n, string2, d);
        Motor_Cycle motor_Cycle = new Motor_Cycle(l, string, n, n2, bl);
        car.vehicleDetails();
        car.carDetails();
        motor_Cycle.displayMotorCycle();
    }
}
