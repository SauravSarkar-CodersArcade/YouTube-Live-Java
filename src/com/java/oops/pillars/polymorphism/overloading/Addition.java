package com.java.oops.pillars.polymorphism.overloading;
public class Addition { // Overloading
    static void add(int a, int b){
        System.out.println("Sum is: " + (a+b));
    }
    static void add(int a, int b, int c){
        System.out.println("Sum is: " + (a+b+c));
    }
    static void add(int a, float b){
        System.out.println("Sum is: " + (a+b));
    }

    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
        add(1,2.5F);
    }

}
