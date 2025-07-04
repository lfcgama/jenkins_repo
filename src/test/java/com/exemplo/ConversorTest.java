package com.exemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ConversorTest {
    @Test
    void testFahrenheitToCelsius() {
        assertEquals(100.0, Conversor.fahrenheitToCelsius(32.0), 0.01);
    }

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, Conversor.celsiusToFahrenheit(0.0), 0.01);
    }
}
