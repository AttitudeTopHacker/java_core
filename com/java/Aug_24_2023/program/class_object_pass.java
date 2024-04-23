package com.java.Aug_24_2023.program;

public class class_object_pass implements Cloneable {
    int data = 100;

    public void changeData(int data) {
        this.data = data + 100;
    }

    public void display() {
        System.out.println("show Data :- " + data);
    }

    public static void main(String[] args) {
        class_object_pass objectPass = new class_object_pass();
        class_object_pass objectPass1 = objectPass.clone();
        objectPass.display();
        objectPass1.changeData(objectPass.data);
        objectPass.display();
        objectPass1.display();
    }

    @Override
    public class_object_pass clone() {
        try {

            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (class_object_pass) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
