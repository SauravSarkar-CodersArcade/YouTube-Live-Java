package com.java.basics.strings;
public class ProblemOfTheDay {
    static boolean countVowelsInStringParts(String s){
        int n = s.length();
        int halfLength = n/2;
        String s1 = "";
        String s2 = "";
        int vc1 = 0;
        int vc2 = 0;
        for (int i = 0; i<halfLength; i++){
            s1 += s.charAt(i);
            if (    s.charAt(i) == 'a' ||
                    s.charAt(i) == 'e' ||
                    s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u'){
                vc1++;
            }
        }
        for (int i = halfLength+1; i<n; i++){
            s2 += s.charAt(i);
            if (    s.charAt(i) == 'a' ||
                    s.charAt(i) == 'e' ||
                    s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u'){
                vc2++;
            }
        }
        return vc1 == vc2;
    }

    public static void main(String[] args) {
        String str = "codingninjas";
        boolean result = countVowelsInStringParts(str);
        System.out.println(result);
    }
}
