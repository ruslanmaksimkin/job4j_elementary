package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CheckPrimeNumberTest {

    @Test
    public void check5() {
        int number = 5;
        boolean prime = CheckPrimeNumber.check(number);
        assertThat(prime).isTrue();
    }

    @Test
    public void check4() {
        int number = 4;
        boolean prime = CheckPrimeNumber.check(number);
        assertThat(prime).isFalse();
    }

    @Test
    public void check1() {
        int number = 10;
        boolean prime = CheckPrimeNumber.check(number);
        assertThat(prime).isFalse();
    }
}