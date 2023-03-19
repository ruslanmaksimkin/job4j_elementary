package ru.job4j.condition;

public class PointTest {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(2, 1, 4, 1);
        System.out.println("result (2, 1) to (4, 1) " + result);
        result = Point.distance(1, 2, 6, 2);
        System.out.println("result (1, 2) to (6, 2) " + result);
        result = Point.distance(3, 4, 7, 6);
        System.out.println("result (3, 4) to (7, 6) " + result);
        result = Point.distance(3, 7, 8, 13);
        System.out.println("result (3, 7) to (8, 13) " + result);
    }
}
