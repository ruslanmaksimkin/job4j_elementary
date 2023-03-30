package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] rusik = new int[5];
        for (int index = 0; index < rusik.length; index++) {
            rusik[index] = index * 2 + 3;
        }
        for (int index = 0; index < rusik.length; index++) {
            System.out.println(rusik[index]);
        }
    }
}
