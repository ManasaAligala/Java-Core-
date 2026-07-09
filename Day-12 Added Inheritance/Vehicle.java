/*
 * Decompiled with CFR 0.152.
 */
class Vehicle {
    long vehicleNumber;
    String brand;
    int rentalDays;

    public Vehicle(long l, String string, int n) {
        this.vehicleNumber = l;
        this.brand = string;
        this.rentalDays = n;
    }

    void vehicleDetails() {
        System.out.println("-----------------");
        System.out.println("Vehicle Details:");
        System.out.println("Vehicle Number: " + this.vehicleNumber);
        System.out.println("Brand: " + this.brand);
        System.out.println("Rental_Days: " + this.rentalDays);
        System.out.println("");
    }
}
