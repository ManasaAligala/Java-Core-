/*
 * Decompiled with CFR 0.152.
 */
class Employee
extends Person {
    int e_id;
    String em_designation;

    public Employee(String string, int n, int n2, String string2) {
        super(string, n);
        this.e_id = n2;
        this.em_designation = string2;
    }

    void employeeDetails() {
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("Employeee Details: ");
        System.out.println("id: " + this.e_id);
        System.out.println("designation: " + this.em_designation);
    }
}
