/*
 * Decompiled with CFR 0.152.
 */
class Person {
    String name;
    int age;

    Person(String string, int n) {
        this.name = string;
        this.age = n;
    }

    void displayPerson() {
        System.out.println("");
        System.out.println("Details of the Person: ");
        System.out.println("----------------------");
        System.out.println("name: " + this.name);
        System.out.println(" age: " + this.age);
    }
}
