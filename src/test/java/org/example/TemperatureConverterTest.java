package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void testFahrenheitToCelcius() {
        assertEquals(0, TemperatureConverter.fahrenheitToCelcius(32), 0.001);
        assertEquals(100, TemperatureConverter.fahrenheitToCelcius(212), 0.001);
        assertEquals(-40, TemperatureConverter.fahrenheitToCelcius(-40), 0.001);
    }

    @Test
    void testCelciusToFahrenheit() {
        assertEquals(32, TemperatureConverter.celciusToFahrenheit(0), 0.001);
        assertEquals(212, TemperatureConverter.celciusToFahrenheit(100), 0.001);
        assertEquals(-40, TemperatureConverter.celciusToFahrenheit(-40), 0.001);
    }

    @Test
    void testIsExtremeTemperature() {
        assertFalse(TemperatureConverter.isExtremeTemperature(-50));
        assertTrue(TemperatureConverter.isExtremeTemperature(0));
        assertTrue(TemperatureConverter.isExtremeTemperature(100));
    }
}