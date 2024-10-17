package com.java.core.LearnIterface;

import com.java.core.LearnAbstract.AnimalAbstract;

public class People extends AnimalAbstract implements AnimalInterface {
    String work;

    public People(String name, int age, String work) {
        super(name, age);
        this.work = work;
    }

    @Override
    public String run() {
        return "Nguoi chay 2 chan!";
    }

    @Override // Overriding
    public String getName(){
        return "Overriding get name " + super.getName();
    }
}
