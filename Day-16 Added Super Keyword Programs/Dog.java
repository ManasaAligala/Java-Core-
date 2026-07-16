/*
 * Decompiled with CFR 0.152.
 */
class Dog
extends Puppy {
    String name = "Dog_tommy";

    Dog() {
    }

    void display() {
        System.out.println("Displaying details of puppy and dog");
        System.out.println("puppy name: " + ((Puppy)this).name);
        System.out.println("Dog name: " + this.name);
    }
}
