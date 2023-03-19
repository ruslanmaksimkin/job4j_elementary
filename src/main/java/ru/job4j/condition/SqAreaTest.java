package ru.job4j.condition;

public class SqAreaTest {

    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * k;
        return s;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2,  s = 2, real = " + result);
        result = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1,  s = 1, real = " + result);
        result = SqArea.square(16, 4);
        System.out.println(" p = 16, k = 4,  s = 25.6, real = " + result);
        result = SqArea.square(41, 17);
        System.out.println(" p = 41, k = 17,  s = 329.1, real = " + result);
    }
}
