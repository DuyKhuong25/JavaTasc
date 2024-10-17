package com.java.core.LearnAbstract;

public abstract class AnimalAbstract {
    String name;
    int age;



    public AnimalAbstract(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String run();

//    public abstract Integer run();

    public String getName() {
        return name;
    }
}
