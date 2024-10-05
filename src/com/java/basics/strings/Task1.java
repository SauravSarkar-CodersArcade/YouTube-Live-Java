package com.java.basics.strings;
public class Task1 {
    // Write a method in Java which can remove all
    // occurrences of a character from a String
    // str = "JAVA PROGRAMMING" ch = 'A'
    // o/p = "JV PROGRMMING"
    public static void main(String[] args) {
        String str = "JAVA PROGRAMMING";
        char ch = 'A';
        removeAllOccurrences(str, ch);
    }
    public static void removeAllOccurrences(String str, char ch){
        String finalStr = "";
        int len = str.length();
        for (int i=0; i<len; i++){
            if (str.charAt(i) != 'A'){
                finalStr += str.charAt(i);
            }
        }
        System.out.println(finalStr);

    }
}
