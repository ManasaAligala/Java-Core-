/*
 * Decompiled with CFR 0.152.
 */
class Student
extends Person {
    int rollNo;
    String branch;

    public Student(String string, int n, int n2, String string2) {
        super(string, n);
        this.rollNo = n2;
        this.branch = string2;
    }

    void displayStudent() {
        System.out.println("----------------------");
        System.out.println("Details Of student: ");
        System.out.println("rollno: " + this.rollNo);
        System.out.println("branch: " + this.branch);
        System.out.println("");
    }
}
