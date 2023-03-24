package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";
                break;
            case 7:
                name = "Sunday";
                break;
            default:
                name = "Mistake";
                break;
        }
        return name;
    }

    public static void main(String[] args) {
        String day = SwitchWeek.nameOfDay(1);
        System.out.println(day);
        day = SwitchWeek.nameOfDay(2);
        System.out.println(day);
        day = SwitchWeek.nameOfDay(3);
        System.out.println(day);
        day = SwitchWeek.nameOfDay(4);
        System.out.println(day);
        day = SwitchWeek.nameOfDay(5);
        System.out.println(day);
        day = SwitchWeek.nameOfDay(6);
        System.out.println(day);
        day = SwitchWeek.nameOfDay(7);
        System.out.println(day);
        day = SwitchWeek.nameOfDay(10);
        System.out.println(day);
        day = SwitchWeek.nameOfDay(31);
        System.out.println(day);
        day = SwitchWeek.nameOfDay(1001);
        System.out.println(day);
    }
}
