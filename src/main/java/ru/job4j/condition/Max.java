package ru.job4j.condition;

public class Max {
    public static String max(int left, int right) {
        String result = "";
        if (right > left) {
            result = "Да, верно.";
        }
        if (left > right) {
            result = "Нет, не верно.";
        }
        if (right == left) {
            result = "Оба значения равнозначны.";
        }
        return result;
    }

    public static void main(String[] args) {
        String box = Max.max(1, 2);
        System.out.println(box);
        box = Max.max(20, 10);
        System.out.println(box);
        box = Max.max(5, 5);
        System.out.println(box);
    }
}