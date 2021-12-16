package com.example.temp_conv;

public class ConverterUtil {
    // converts to celsius
    public static double convertPoundToCKilos(float pound) {
        return (pound / 2.205);
    }

    // converts to fahrenheit
    public static double convertkilosTopound(float kilos) {
        return (kilos * 2.205);
    }
}