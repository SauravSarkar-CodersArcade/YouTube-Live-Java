package com.java.basics.strings;
interface MIT { // 100%
    void print();
}
class ABC implements MIT{
    public void print(){

    }
}
abstract public class GSSS { // 0-100%
    abstract void display();
    void print(){
        System.out.println("GSSS");
    }
}
class X extends GSSS {
    void display(){

    }
}
