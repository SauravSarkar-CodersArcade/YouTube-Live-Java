package com.java.basics.loops;
public class ForLoop {
    public static void main(String[] args) {

//        // Printing 1 - 10
//        for (int i=1; i<=10; i++){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        // Printing 10 - 1
//        for (int i=10; i>=1; i--){
//            System.out.print(i + " ");
//        }
        for (int i=1; i <= 100; i++){
            if (i % 17 == 0){
                System.out.println(i + " is divisible by 17");
            }else {
                System.out.println(i + " is not divisible by 17");
            }
        }
    }
}
