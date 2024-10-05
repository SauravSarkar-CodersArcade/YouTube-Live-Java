package com.java.basics.strings;

public class StringBuilderExample {
    public void stringAppend(){
        StringBuilder stringBuffer = new StringBuilder("Coders");
        System.out.println("Original String: " + stringBuffer); // Coders
        stringBuffer.append(" Arcade");
        System.out.println("New String: " + stringBuffer); // Coders Arcade
    }
    public void stringInsert(){
        StringBuilder stringBuffer = new StringBuilder("JA");
        System.out.println("Original String: " + stringBuffer); // JA
        stringBuffer.insert(1,"AV");
        System.out.println("New String: " + stringBuffer); // JAVA
    }
    public void stringReverse(){
        StringBuilder stringBuffer = new StringBuilder("KNAHSA");
        System.out.println("Original String: " + stringBuffer); // KNAHSA
        stringBuffer.reverse();
        System.out.println("New String: " + stringBuffer); // ASHANK
    }
    public static void main(String[] args) {
        StringBuilderExample stringBufferExample = new StringBuilderExample();
        stringBufferExample.stringAppend();
        stringBufferExample.stringInsert();
        stringBufferExample.stringReverse();

    }
}
