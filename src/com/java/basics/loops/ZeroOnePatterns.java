package com.java.basics.loops;

import java.util.Scanner;

public class ZeroOnePatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        int n = sc.nextInt();
        System.out.println("Zero One Pattern");
        for (int r=1; r<=n; r++){
            for (int c=1; c<=r; c++){
                if ((r+c) % 2 == 0){
                    System.out.print("0 ");
                }else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
        System.out.println("One Zero Pattern");
        for (int r=1; r<=n; r++){
            for (int c=1; c<=r; c++){
                if ((r+c) % 2 == 0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
