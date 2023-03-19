package ru.job4j.calculator;

public class FitTest {

    public static double manWeight(short height) {
        return height / 2.45;
    }

    public static double womanWeight(short height) {
        return height / 2.80;
    }

    public static void main(String[] args) {
        short height = 185;
        double man = FitTest.manWeight(height);
        System.out.println("Man 185 is: " + man);
        height = 165;
        double woman = FitTest.womanWeight(height);
        System.out.println("Woman 165 is: " + woman);
    }
}
