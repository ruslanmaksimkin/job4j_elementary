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
    public void whenMax23To17Then23() {
        int left = 23;
        int right = 17;
        int result = Max.max(left, right);
        int expected = 23;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax23To23Then23() {
        int left = 23;
        int right = 23;
        int result = Max.max(left, right);
        int expected = 23;
        assertThat(result).isEqualTo(expected);
    }
}