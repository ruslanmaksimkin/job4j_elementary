package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 1400;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001F;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert3850RblThen59dot23077Dlr() {
        float in = 3850;
        float expected = 59.23077F;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001F;
        Assert.assertEquals(expected, out, eps);
    }
}