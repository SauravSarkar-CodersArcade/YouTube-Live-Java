package com.java.oops.pillars.encapsulation;

public class EncapEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        // Setters have been used
        e1.setEmail("xyz@gmail.com");
        e1.setName("Nagendra");
        e1.setEmpID(1001);
        // Getters
        System.out.println("Emp ID: "+ e1.getEmpID());
        System.out.println("Email: "+e1.getEmail());
        System.out.println("Name: "+e1.getName());

    }
}
