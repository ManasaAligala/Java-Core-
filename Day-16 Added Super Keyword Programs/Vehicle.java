/*
 * Decompiled with CFR 0.152.
 */
class Vehicle {
    int petrol_limit = 6;
    int milage = 10;

    Vehicle() {
    }

    void vehicle() {
        System.out.println("Displaying Vehicle details: ");
        System.out.println("petrol limit : " + this.petrol_limit);
        System.out.println("milage  : " + this.milage);
    }
}
