package com.java.oops.pillars.inheritance.multi;
class Parent {
    void parent(){
        System.out.println("Parent Class Method");
    }
}
class Child extends Parent{
    void child(){
        System.out.println("Child Class Method");
    }
}
class GrandChild extends Child{
    void grandChild(){
        System.out.println("GrandChild Class Method");
    }
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        Parent parent = new Parent();
        parent.parent();
        System.out.println("---------------------------------------------");
        Child child = new Child();
        child.parent();
        child.child();
        System.out.println("---------------------------------------------");
        GrandChild grandChild = new GrandChild();
        grandChild.parent();
        grandChild.child();
        grandChild.grandChild();
        System.out.println("---------------------------------------------");
    }
}

