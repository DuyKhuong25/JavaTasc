package com.java.core.LearnIterface;

public class Dog implements AnimalInterface, Person{

    public void getInfo(){
        System.out.println("I am Dog");
    };


    // Overloading
    public void getInfo(String name){
        System.out.println("I am Dog. My name is " + name);
    }

    @Override
    public String run() {
        return "Cho chay 4 chan!";
    }
}
