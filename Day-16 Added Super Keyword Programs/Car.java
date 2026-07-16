/*
 * Decompiled with CFR 0.152.
 */
class Car
extends Vehicle {
    int petrol_limit = 10;
    int milage = 20;

    Car() {
    }

    void parent_Acess() {
        super.vehicle();
    }

    @Override
    void vehicle() {
        System.out.println("");
        System.out.println("Displaying Car details: ");
        System.out.println("petrol limit : " + this.petrol_limit);
        System.out.println("milage  : " + this.milage);
    }
}
