/*
 * Decompiled with CFR 0.152.
 */
class Child
extends Parent {
    String name;

    Child() {
    }

    void display() {
        System.out.println("Parent Variable:" + ((Parent)this).name);
        System.out.println("Child varaible: " + this.name);
    }
}
