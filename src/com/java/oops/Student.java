package com.java.oops;

public class Student {
    // Properties
    // Attributes
    String name;
    int RollNo;
    String email;
    // Method
    public void studentDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + RollNo);
        System.out.println("Email: " + email);
    }
    public static void main(String[] args) {
        // Instance, Object, Reference, Variable
        // ClassName obj = new ClassName();
        Student s1 = new Student();
        s1.name = "Saurav";
        s1.RollNo = 123;
        s1.email = "codersarcade@gmail.com";
        s1.studentDetails();
        Student s2 = new Student();
        s2.name = "Ashank";
        s2.RollNo = 124;
        s2.email = "codersarcade@gmail.com";
        s2.studentDetails();
    }

}
