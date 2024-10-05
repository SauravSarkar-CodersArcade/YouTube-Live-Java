package com.java.basics.conditionals;

public class NestedIfElse {
    /*
    Even
        Even & Div By 4
        Even & Not Div By 4
    Odd
        Odd & Div By 3
        Odd & Not Div By 3

     */
    public static void main(String[] args) {
        int n = 11;
        if (n % 2 == 0){
            if ( n % 4 == 0){
                System.out.println("Even & Div By 4");
            }else{
                System.out.println("Even & Not Div By 4");
            }
        }else{
            if ( n % 3 == 0){
                System.out.println("Odd & Div By 3");
            }else {
                System.out.println("Odd & Not Div By 3");
            }
        }
    }
}
