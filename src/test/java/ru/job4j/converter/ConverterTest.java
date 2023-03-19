package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert200RblThen2dot3333Dlr() {
        float in = 3850;
        float expected = 50.6578947F;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001F;
        Assert.assertEquals(expected, out, eps);
    }
}