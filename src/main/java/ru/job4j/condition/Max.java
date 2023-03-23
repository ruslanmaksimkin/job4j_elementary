package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static void main(String[] args) {
        int max = Max.max(17, 23);
        System.out.println(max);
        max = Max.max(23, 17);
        System.out.println(max);
        max = Max.max(23, 23);
        System.out.println(max);
    }
}