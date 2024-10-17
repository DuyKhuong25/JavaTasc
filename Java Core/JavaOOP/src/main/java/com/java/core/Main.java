package com.java.core;

import com.java.core.LearnIterface.Dog;
import com.java.core.LearnIterface.People;
import com.java.core.LearnIterface.Person;

class Parent {
    public static void show() {
        System.out.println("Parent show");
    }

    private void display() {
        System.out.println("Parent display");
    }

    public final void print() {
        System.out.println("This is a final method in Parent class.");
    }
}

class Personal {
    private String name;

    public Personal(String name) {
        this.name = name;  // 'this' tham chiếu đến biến instance 'name' của lớp
    }

    public void display() {
        System.out.println("Name: " + this.name);  // 'this' tham chiếu đến biến 'name'
    }
}

class Child extends Parent {
    public static void show() {
        System.out.println("Child show");
    }

    public void display() {
        System.out.println("Child display");
    }

    // Compilation error nếu cố gắng override phương thức print()
    // @Override
    // public void print() {
    //     System.out.println("Trying to override final method.");
    // }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        People people = new People("abc", 20, "HN");
        String namePeople = people.getName();
        dog.eat(); // Truy cap phuong thuc Default trong Interface
        String name  = Person.name; // Truy cap thuoc tinh static final trong interface
        Person.sleep(10); // Truy cap phuong thuc Static trong Interface
        System.out.println("Run: " + dog.run());
        System.out.println("Run: " + people.run());

        Child child = new Child();
        child.display(); // Output: Child display
        Parent.show();  // Output: Parent show
        Child.show();   // Output: Child show
    }
}