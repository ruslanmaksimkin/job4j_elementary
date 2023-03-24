package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second && first > third) {
            result = second;
        }
        if (second > first && second > third) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        int full = ThreeMax.max(10, 5, 1);
        System.out.println(full);
        full = ThreeMax.max(10, 50, 1);
        System.out.println(full);
        full = ThreeMax.max(1, 5, 100);
        System.out.println(full);
        full = ThreeMax.max(1, 1, 1);
        System.out.println(full);
        full = ThreeMax.max(10, 10, 1);
        System.out.println(full);
        full = ThreeMax.max(100, 1, 100);
        System.out.println(full);
        full = ThreeMax.max(1, 100, 100);
        System.out.println(full);
    }
}
