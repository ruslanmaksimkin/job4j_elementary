package ru.job4j.condition;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax17To23Then23() {
        int left = 17;
        int right = 23;
        int result = Max.max(left, right);
        int expected = 23;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax500To300Then500() {
        int left = 500;
        int right = 300;
        int result = Max.max(left, right);
        int expected = 500;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax777To777Then777() {
        int left = 777;
        int right = 777;
        int result = Max.max(left, right);
        int expected = 777;
        assertThat(result).isEqualTo(expected);
    }
}