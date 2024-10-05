package com.java.basics.strings;

public class StringBuiltInMethods {
    public static void main(String[] args) {
//        // length
//        String str = "Coders Arcade";
//        int len = str.length();
//        System.out.println(len);
//        // Print characters - charAt('index')
//        System.out.println(str.charAt(0));
//        System.out.println(str.charAt(7));
//        System.out.println(str.charAt(str.length()-1));
//        // substring
//        System.out.println(str.substring(3,7));
//        // equals
//        boolean status1 = str.equals("Coders Arcade");
//        System.out.println(status1);
//        // equalsIgnoreCase
//        boolean status2 = str.equalsIgnoreCase("coders arcade");
//        System.out.println(status2);
        String jumbled = "Ritesh1Is1A1Student1Of1JSS1College";
        String[] words = jumbled.split("1");
        for (String word : words){
            System.out.print(word + " ");
        }
        // How to remove beginning & trailing whitespaces
        String data = "    Saurav Sarkar     ";
        System.out.println(data);
        System.out.println(data.trim());

    }
}
