package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 1;
        while (ivan > nik) {
            month = month * 3;
        }
        return month;
    }

    public static void main(String[] args) {
        Fitness.calc(90, 100);
    }
}