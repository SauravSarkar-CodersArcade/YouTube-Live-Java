package com.java.basics.strings;

public class BufferBuilderPerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("JAVA");
        for (int i=1; i<1000000; i++){
            sbf.append(" LANGUAGE");
        }
        System.out.println("Buffer Time: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sbl = new StringBuilder("JAVA");
        for (int i=1; i<1000000; i++){
            sbl.append(" LANGUAGE");
        }
        System.out.println("Builder Time: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
