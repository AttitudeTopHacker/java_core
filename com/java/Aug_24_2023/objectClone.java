package com.java.Aug_24_2023;

//shallow  copy and deep copy
class Student implements Cloneable {
    private String StudentName;
    final private int RollNumber;

    Student(String StudentName, int RolllNumber) {
        this.StudentName = StudentName;
        this.RollNumber = RolllNumber;
    }

    public void display() {
        System.out.println(StudentName + " --> " + RollNumber);
    }

    public void SetData() {
        this.StudentName = "shakir";
    }

    @Override
    public Student clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

public class objectClone {
    public static void main(String[] args) {
        Student student = new Student("mohd salman", 3434);
        student.display();
        Student student1 = student;
        student1.display();
        System.out.println("the change Data Student1 :-");
        student1.SetData();
        System.out.println("Print Student Data :-");
        student.display();

    }
}
