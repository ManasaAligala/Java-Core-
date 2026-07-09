/*
 * Decompiled with CFR 0.152.
 */
class Developer
extends Manager {
    int exp;
    char Programming_lan;

    Developer(String string, int n, int n2, String string2, int n3, String string3, double d, String string4, int n4, char c) {
        super(string, n, n2, string2, n3, string3, d, string4);
        this.exp = n4;
        this.Programming_lan = c;
    }

    void display_Developer() {
        System.out.println("-----------------");
        System.out.println("Developer Details");
        System.out.println("Experience: " + this.exp);
        System.out.println("Programming language: " + this.Programming_lan);
    }
}
