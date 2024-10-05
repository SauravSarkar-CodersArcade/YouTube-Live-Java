package com.java.oops.pillars.inheritance.single;

public class Animal { // Parent
    private String name;
    static void display(){
        System.out.println("This is the Animal class.");
    }
    void eat(){
        System.out.println("Animals eat some kind of food...!!!");
    }
    void walk(){
        System.out.println("Most Animals walk on 4 legs...!!!");
    }
}
class Dog extends Animal{ // Children
    void method(){
     super.eat();
     super.walk();
    }
    void run(){
        System.out.println("Dogs run fast...!!!");
    }
    public static void main(String[] args) {
        display();
//        Dog dog = new Dog();
//        dog.
//        dog.eat();
//        dog.walk();
//        dog.run();
    }
}
