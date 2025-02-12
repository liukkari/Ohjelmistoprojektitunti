package org.example;

public class TemperatureConverter {
    public static double fahrenheitToCelcius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celciusToFahrenheit(double celcius) {
        return celcius * 9 / 5 + 32;
    }

    public static boolean isExtremeTemperature(double celciusTemperature) {
        if (celciusTemperature < -40) {
            return false;
        } else {
            return true;
        }
    }
}
