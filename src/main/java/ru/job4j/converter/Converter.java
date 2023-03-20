package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        return value / 65;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2.0. Test result: " + passed);

        float dollar = Converter.rubleToDollar(3850);
        System.out.println("3850 rubles are " + dollar + " dollar.");
        in = 3850;
        expected = 59.23077F;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("3850 rubles are 59.23077. Test result " + passed);
    }
}