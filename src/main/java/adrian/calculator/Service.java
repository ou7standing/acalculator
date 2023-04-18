package adrian.calculator;

import org.springframework.stereotype.Component;

@Component
public class Service {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double exponent(double base, int exponent) {
        double result = 1;
        boolean isNegativeExponent = exponent < 0;
        exponent = Math.abs (exponent);
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        if (isNegativeExponent) {
            result = 1 / result;
        }
        return result;
    }

    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException ("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt (number);
    }
}