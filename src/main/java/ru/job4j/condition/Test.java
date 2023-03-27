package ru.job4j.condition;

public class Test {
    public static String checkNumber(int number) {
        String rsl = null;
        if (number % 3 == 0 && number % 2 == 0) {
            rsl = "Исходное число делится на 6.";
        } else if (number % 3 == 0 && number % 2 != 0) {
            rsl = "Исходное число делится на 3, но не является чётным.";
        } else if (number % 3 != 0 && number % 2 == 0) {
            rsl = "Исходное число не делится на 3, но является чётным.";
        } else if (number % 3 != 0 && number % 2 != 0) {
            rsl = "Исходное число не делится на 3, но не является чётнымю";
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(15));
        System.out.println(checkNumber(22));
        System.out.println(checkNumber(36));
        System.out.println(checkNumber(47));
    }
}

