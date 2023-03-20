package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTestTest {

    @Test
    public void whenMan187Then100dot05() {
        short in = 187;
        double expected = 100.05;
        double out = FitTest.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman175Then74dot75() {
        short in = 175;
        double expected = 74.75;
        double out = FitTest.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}