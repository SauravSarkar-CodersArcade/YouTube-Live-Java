package com.java.basics.methods;

import java.util.*;

public class HammingWeight {
    static int hammingWeight(int n){
        int count = 0;
        while (n > 0){
            if ((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    static String reverseString(String str){
        String[] words = str.split(" ");
        List<String> wordList = Arrays.asList(words);
        Collections.reverse(wordList);
        String reversed = String.join(" ", wordList);
        return reversed;
    }
    public static void main(String[] args) {
//        int n1 = 5;
//        System.out.println("HW of 5 is: " + hammingWeight(n1)); // 2
//        int n2 = 11;
//        System.out.println("HW of 11 is: " + hammingWeight(n2)); // 3
        String str = "Subscribe To Coders Arcade";
        String reversed = reverseString(str);
        System.out.println(reversed);
    }
}
