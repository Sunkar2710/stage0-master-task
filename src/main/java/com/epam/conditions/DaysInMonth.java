package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                }
            }
            else {
                isLeap = true;
            }
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            case 2:
                System.out.println(isLeap ? 29 : 28);
                break;
            default:
                System.out.println("invalid date");
                break;
        }
    }
}
