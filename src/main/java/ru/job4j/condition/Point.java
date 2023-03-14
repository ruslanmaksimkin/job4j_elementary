package ru.job4j.condition;

public class Point {
    public static double distanse1(int x1, int x2) {
        double rsl = x2 - x1;
        return rsl;
    }

    public static double distanse2(int y1, int y2) {
        double rsl = y2 - y1;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distanse1(0, 2);
        System.out.println(result1);
        double result2 = Point.distanse1(0, 0);
        System.out.println(result2);
        double result3 = Math.pow(result1, 2);
        System.out.println(result3);
        double result4 = Math.pow(result2, 2);
        System.out.println(result4);
        double result5 = result3 + result4;
        System.out.println(result5);
        double result6 = Math.sqrt(result5);
        System.out.println(result6);
    }
}
