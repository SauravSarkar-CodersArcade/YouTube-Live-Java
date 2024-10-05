package com.java.basics.methods;
public class SumOfNumbers {
    static int sum(int a, int b){
        return a+b;
    }
    static void greetSomeone(String name){
        System.out.println("Hello: " + name);
        System.out.println("Welcome to Coders Arcade");
        System.out.println("Please Subscribe to our Channel...!!!");
    }
    public static void main(String[] args) {
        System.out.println(sum(2,5));
        int s = sum(1,2);
        System.out.println(s);
    }
}
