package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTestTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = PointTest.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when21to41then2() {
        double expected = 2;
        int x1 = 2;
        int y1 = 1;
        int x2 = 4;
        int y2 = 1;
        double out = PointTest.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to62then5() {
        double expected = 5;
        int x1 = 1;
        int y1 = 2;
        int x2 = 6;
        int y2 = 2;
        double out = PointTest.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when34to76then4dot4721() {
        double expected = 4.4721;
        int x1 = 3;
        int y1 = 4;
        int x2 = 7;
        int y2 = 6;
        double out = PointTest.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when37to813then7dot8182() {
        double expected = 7.8102;
        int x1 = 3;
        int y1 = 7;
        int x2 = 8;
        int y2 = 13;
        double out = PointTest.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}