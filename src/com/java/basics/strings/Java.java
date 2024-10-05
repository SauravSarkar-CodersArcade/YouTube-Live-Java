package com.java.basics.strings;

import java.util.Arrays;

public class Java {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = new int[arr1.length];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        System.out.println(Arrays.asList(arr2));
    }
}
