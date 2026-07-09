/*
 * Decompiled with CFR 0.152.
 */
class Motor_Cycle
extends Vehicle {
    int engineCapacity;
    boolean helmetRequired;

    public Motor_Cycle(long l, String string, int n, int n2, boolean bl) {
        super(l, string, n);
        this.engineCapacity = n2;
        this.helmetRequired = bl;
    }

    void displayMotorCycle() {
        System.out.println("-----------------");
        System.out.println("Motor Cycle Details: ");
        System.out.println("engineCapacity: " + this.engineCapacity);
        System.out.println("HelmetRequirement: " + this.helmetRequired);
        System.out.println("");
    }
}
