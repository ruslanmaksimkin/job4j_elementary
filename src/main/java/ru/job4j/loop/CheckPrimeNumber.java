package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        int hold = 0;
        for (int index = 0; index <= number; index++) {
            hold += index;
            if (hold == number) {
                System.out.println("N = " + number + ". Success.");
                break;
            } else if (number % 5 == 0) {
                System.out.println("N = " + number + ". Success.");
                break;
            } else if (hold > number) {
                System.out.println("N = " + number + ". Not possible.");
                break;
            } else if (number % 2 == 0) {
                System.out.println("N = " + number + ". Not possible.");
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        check(5);
        check(4);
        check(1);
    }
}
