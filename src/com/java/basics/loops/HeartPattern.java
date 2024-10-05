package com.java.basics.loops;
public class HeartPattern {
    public static void main(String[] args) {
        // rows = 6
        // columns = 7
        for (int r=0; r<6; r++){ // rows
            for (int c=0; c<7; c++){ // columns
                if (r==0 && c%3 != 0 ||
                r == 1 && c%3 == 0 || r-c == 2 ||
                r + c == 8){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
