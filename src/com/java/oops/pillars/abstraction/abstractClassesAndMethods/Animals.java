package com.java.oops.pillars.abstraction.abstractClassesAndMethods;

abstract class Animals {
    // Two types of methods
    // 1. Abstract Method
    abstract void speed();
    // 2. Normal Method - Concrete Method
    void eat(){
        System.out.println("Animals eat some food...!!");
    }
}
class Panda extends Animals {
    @Override
    void speed() {
        System.out.println("Pandas are very slow moving animals.");
    }
}
class Tiger extends Animals{
    @Override
    void speed() {
        System.out.println("Tigers are very fast moving animals..!!");
    }
}
class Abstraction {
    public static void main(String[] args) {
        Panda panda = new Panda();
        Tiger tiger = new Tiger();
        panda.eat();
        panda.speed();
        tiger.eat();
        tiger.speed();
    }
}
