package ru.job4j.loop;

public class Counter {
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int x = finish; x >= start; x -= 1) {
            if (x % 2 == 0) {
                sum = sum + x;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}