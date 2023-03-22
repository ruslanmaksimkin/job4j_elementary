package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition  = true;
        return Math.max(left, right);
    }

    public static void main(String[] args) {
        int max = Max.max(17, 23);
        System.out.println(max);
        max = Max.max(500, 300);
        System.out.println(max);
        max = Max.max(777, 777);
        System.out.println(max);
    }
}