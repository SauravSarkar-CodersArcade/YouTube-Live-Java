package com.java.basics.conditionals;
import java.util.Scanner;

public class Yield {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        String typeOfDay = switch (day){
            case "MON", "TUE", "WED", "THU", "FRI" -> "WEEKDAY";
            case "SAT", "SUN" -> "WEEKEND";
            default -> {
                if (day.isEmpty()){
                    yield "Sorry! No Data Given.";
                }else {
                    yield "Invalid Data";
                }
            }
        };
        System.out.println("The type of day is -> " + typeOfDay);
    }

}
