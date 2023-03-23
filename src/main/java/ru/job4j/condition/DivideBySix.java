package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl = null;
        if (number % 3 == 0 && number % 2 == 0) {
            rsl = "Исходное число делится на 6.";
        } else if (number % 3 == 0 && number % 2 != 0) {
            rsl = "Исходное число делится на 3, но не является чётным.";
        } else if (number % 3 != 0 && number % 2 == 0) {
            rsl = "Исходное число не делится на 3, но является чётным.";
        } else if (number % 3 != 0 && number % 2 != 0) {
            rsl = "Исходное число не делится на 3, но не является чётным.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(24));
        System.out.println(checkNumber(9));
        System.out.println(checkNumber(14));
        System.out.println(checkNumber(25));
    }
}