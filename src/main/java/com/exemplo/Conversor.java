package com.exemplo;

public class Conversor {
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    
    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }
}
