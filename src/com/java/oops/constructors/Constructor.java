package com.java.oops.constructors;

public class Constructor {
    int x;
    int y;
    public Constructor(){
        x = 10;
        y = 20;
    }
    public Constructor(int a, int b){
        x = a;
        y = b;
    }
    public Constructor(int a, float b){
        x = a;
        y = (int) b; // User -> Explicit
    }
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        System.out.println(c1.x + " " + c1.y); // 10, 20
        Constructor c2 = new Constructor(1,2);
        System.out.println(c2.x + " " + c2.y); // 1 2
        Constructor c3 = new Constructor(1,2.5f);
        System.out.println(c3.x + " " + c3.y); // 1 2
    }
}
