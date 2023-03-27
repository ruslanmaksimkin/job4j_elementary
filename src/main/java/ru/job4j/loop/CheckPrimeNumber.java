package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                System.out.println("N = " + number + ". Not possible.");
                prime = false;
                break;
            } else {
                System.out.println("N = " + number + ". Success.");
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        check(5);
        check(4);
        check(1);
        check(3);
        check(23);
        check(83);
        check(84);

    }
}
