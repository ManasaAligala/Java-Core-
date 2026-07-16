/*
 * Decompiled with CFR 0.152.
 */
class Samsung
extends Phone {
    int ram;
    int storage;
    int cam_Quality;

    public Samsung(int n, int n2, int n3) {
        super(n, n2);
        this.ram = n;
        this.storage = n2;
        this.cam_Quality = n3;
    }

    void access_parent_method() {
        super.phone();
    }

    @Override
    void phone() {
        System.out.println("Samungs Details");
        System.out.println("Ram: " + this.ram);
        System.out.println("Storage: " + this.storage);
        System.out.println("cam_Quality: " + this.cam_Quality);
    }
}
