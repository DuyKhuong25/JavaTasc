package com.java.core.LearnIterface;

public interface Person {
    String name = "a"; // Khai bao thuoc tinh trong Interface -> thuoc tinh nay la hang so static final

    String run();

    static void sleep(long millis) {}

    default void eat(){

    }
//    Integer run();
}
