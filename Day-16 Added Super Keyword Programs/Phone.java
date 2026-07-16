/*
 * Decompiled with CFR 0.152.
 */
class Phone {
    int ram;
    int storage;

    Phone(int n, int n2) {
        this.ram = n;
        this.storage = n2;
    }

    void phone() {
        System.out.println("Displaying phone detials: ");
        System.out.println("Ram: " + this.ram);
        System.out.println("Storage: " + this.storage);
    }
}
