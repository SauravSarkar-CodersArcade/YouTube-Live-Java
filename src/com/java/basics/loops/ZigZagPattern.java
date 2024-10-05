package com.java.basics.loops;

import java.util.Scanner;

public class ZigZagPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt(); // 9, 13, 17, 21, 25 and so on
        System.out.println("Zig Zag Logic 1:");
        for (int r=1; r<=3; r++){
            for (int c=1; c<=cols; c++){
                if ((r+c) % 4 == 0 || (r==2 && c%4 == 0)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Zig Zag Logic 2");
        for (int r=1; r<=3; r++){
            for (int c=1; c<=cols; c++){
                if (    (r == 1 && c % 4 == 3) ||
                        (r == 2 && c % 2 == 0) ||
                        (r == 3 && c % 4 == 1)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
