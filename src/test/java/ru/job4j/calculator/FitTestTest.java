package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTestTest {

    @Test
    public void whenMan185Then75dot510() {
        short in = 185;
        double expected = 75.510;
        double out = FitTest.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman165Then58dot928() {
        short in = 165;
        double expected = 58.928;
        double out = FitTest.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}