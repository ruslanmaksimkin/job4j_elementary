package ru.job4j.condition;

public class Point {
    public static double distance1(int x1, int y1, int x2, int y2) {
        double rsl1 = x2 - x1;
        return rsl1;
    }

    public static double distance2(int x1, int y1, int x2, int y2) {
        double rsl2 = y2 - y1;
        return rsl2;
    }

    public static double distance3(int x1, int y1, int x2, int y2) {
        double rsl3 = Math.pow(x2 - x1, 2);
        return rsl3;
    }

    public static double distance4(int x1, int y1, int x2, int y2) {
        double rsl4 = Math.pow(y2 - y1, 2);
        return rsl4;
    }

    public static void main(String[] args) {
        double result5 = Math.sqrt(distance3(0, 0, 2, 0) + distance4(0, 0, 2, 0));
        System.out.println(result5);
    }
}
