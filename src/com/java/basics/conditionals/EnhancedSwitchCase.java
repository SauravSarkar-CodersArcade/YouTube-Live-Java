package com.java.basics.conditionals;
import java.util.Scanner;
// ->  Lambda Expressions - yield
public class EnhancedSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day:");
        String day = sc.nextLine();
        String typeOfDay = switch (day) {
            case "MON", "TUE", "WED", "THU", "FRI" -> "Weekday";
            case "SAT", "SUN" -> "Weekend";
            default -> {
                if (day.isEmpty()){
                    yield "No Data Passed.!";
                }else {
                    yield "Invalid Data";
                }
            }
        };
        System.out.println("The day is: " + typeOfDay);
    }
}
