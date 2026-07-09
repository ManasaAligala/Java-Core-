/*
 * Decompiled with CFR 0.152.
 */
class Manager
extends Employee {
    int teamSize;
    String projectName;
    double bonus;
    String managerLevel;

    public Manager(String string, int n, int n2, String string2, int n3, String string3, double d, String string4) {
        super(string, n, n2, string2);
        this.teamSize = n3;
        this.projectName = string3;
        this.bonus = d;
        this.managerLevel = string4;
    }

    void managerDetails() {
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("Displaying Manager Details: ");
        System.out.println("teamsize: " + this.teamSize);
        System.out.println("projectName: " + this.projectName);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Manager Level: " + this.managerLevel);
    }
}
