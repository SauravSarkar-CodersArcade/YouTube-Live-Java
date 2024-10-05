package com.java.basics.conditionals;

public class IfElseIfElse {
    public static void main(String[] args) {
        int n = 0;
        if (n > 0){
            System.out.println(n + " is a positive integer.");
        }else if (n < 0){
            System.out.println(n + " is a negative integer.");
        }else {
            System.out.println("The number given is zero.");
        }
    }
}
