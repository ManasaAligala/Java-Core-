/*
 * Decompiled with CFR 0.152.
 */
class Manager
extends Employee {
    String name = "komal";
    String Designation = "Manager";
    int salary = 70000;

    Manager() {
    }

    void dubby() {
        super.employee();
    }

    @Override
    void employee() {
        System.out.println("Salary: " + this.salary);
    }
}
