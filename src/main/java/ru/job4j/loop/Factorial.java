package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int x = 2; x <= n; x++) {
            result = result * x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(5));
        System.out.println(calc(0));
    }
}
