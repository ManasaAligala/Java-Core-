/*
 * Decompiled with CFR 0.152.
 */
class Car
extends Vehicle {
    String fuel_type;
    double Price_day;

    Car(long l, String string, int n, String string2, double d) {
        super(l, string, n);
        this.fuel_type = string2;
        this.Price_day = d;
    }

    void carDetails() {
        System.out.println("-----------------------");
        System.out.println("Car Details: ");
        System.out.println("fuel_type: " + this.fuel_type);
        System.out.println("Price per day: " + this.Price_day);
        System.out.println("");
    }
}
