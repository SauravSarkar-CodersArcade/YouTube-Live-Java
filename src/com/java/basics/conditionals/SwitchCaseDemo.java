package com.java.basics.conditionals;
import java.util.Scanner;
// ->
public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day:");
        String day = sc.next();
        switch (day){
            case "MON":
            case "TUE":
            case "WED":
            case "THU":
            case "FRI":
                System.out.println(day + " is a Weekday");
                break;
            case "SAT":
            case "SUN":
                System.out.println(day + " is a Weekend");
                break;
            default:
                System.out.println(day + " is an Invalid Data.");
        }
    }
}
