package com.java.oops;

public class Employee {
    // Instance variables
    // this keyword is used to refer to the current class calling object
    String name;
    String email;
    int empID;
    static final String company = "Coders Arcade";
    public Employee(String name, String email, int empID){
        this.name = name;
        this.email = email;
        this.empID = empID;
    }
    public void employeeDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Emp Id: " + this.empID);
        System.out.println("Company: " + company);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Saurav",
                "codersarcade@gmail.com", 101);
        e1.employeeDetails();
        Employee e2 = new Employee("Ashank",
                "codersarcade@gmail.com", 102);
        e2.employeeDetails();
    }
}
