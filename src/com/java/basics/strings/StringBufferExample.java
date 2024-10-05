package com.java.basics.strings;

public class StringBufferExample {
    public void stringAppend(){
        StringBuffer stringBuffer = new StringBuffer("Coders");
        System.out.println("Original String: " + stringBuffer); // Coders
        stringBuffer.append(" Arcade");
        System.out.println("New String: " + stringBuffer); // Coders Arcade
    }
    public void stringInsert(){
        StringBuffer stringBuffer = new StringBuffer("JA");
        System.out.println("Original String: " + stringBuffer); // JA
        stringBuffer.insert(1,"AV");
        System.out.println("New String: " + stringBuffer); // JAVA
    }
    public void stringReverse(){
        StringBuffer stringBuffer = new StringBuffer("KNAHSA");
        System.out.println("Original String: " + stringBuffer); // KNAHSA
        stringBuffer.reverse();
        System.out.println("New String: " + stringBuffer); // ASHANK
    }
    public static void main(String[] args) {
        StringBufferExample stringBufferExample = new StringBufferExample();
        stringBufferExample.stringAppend();
        stringBufferExample.stringInsert();
        stringBufferExample.stringReverse();

    }
}
