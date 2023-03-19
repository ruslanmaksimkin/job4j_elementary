package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTestTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 4;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K1Square1() {
        int expected = 1;
        int p = 4;
        double k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP16K4Square25dot6() {
        double expected = 25.6;
        int p = 16;
        double k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP41K17Square329dot13() {
        double expected = 329.13;
        int p = 41;
        double k = 17;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}