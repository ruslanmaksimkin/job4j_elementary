package ru.job4j.converter;

public class Converter {

    public static float rubleToDollar(float value) {
        float rsl = value / 76;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 3850;
        float expected = 50.6578947F;
        float out = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("3850 rubles are 50.6578. Test result " + passed);
    }
}
