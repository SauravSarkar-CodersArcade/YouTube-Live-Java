package com.java.basics.strings;
import java.util.*;
public class StringExamples {
    public static void main(String[] args) {
        // Way 1
        // String Pool
        String str = new String("Coders Arcade");
        // Way 2
        String str1 = "Coders Arcade";
        char[] letters = {'J','A','V','A'};
        String language = new String(letters); // JAVA
        System.out.println(language);

        Integer b = 10;
        b.toString();
        /////////////////////////////////////////////////////////////
        // Wrapper Classes
        int n1 = 10;
        // Boxing // User
        Integer n2 = new Integer(n1);
        // Auto Boxing // JVM
        Integer n3 = n1;
        // Unboxing ->> User
        int n4 = n3.intValue();
        // Auto Unboxing -->> JVM
        int n5 = n3;
        String string = "120";
        // System.out.println(string * 3);
        Integer strToInt = Integer.parseInt(string);
        System.out.println(strToInt * 3);
        // Immutable
        String fname = "Saurav";
        String lname = " Sarkar";
//        String fullName = fname + " " + lname;
//        System.out.println(fullName);
        String fullNameUsingMethod = fname.concat(lname);
        System.out.println(fullNameUsingMethod);
        System.out.println(fname.toUpperCase());
        System.out.println(fname);
        System.out.println(Integer.MAX_VALUE);

    }
}
