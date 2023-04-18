package adrian.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    Service service;

    @RequestMapping("/add")
    public double add(double a, double b) {
        return service.add (a, b);
    }

    @RequestMapping("/subtract")
    public double subtract(double a, double b) {
        return service.subtract (a, b);
    }

    @RequestMapping("/multiply")
    public double multiply(double a, double b) {
        return service.multiply (a, b);
    }

    @RequestMapping("/divide")
    public double divide(double a, double b) {
        return service.divide (a, b);
    }

    @RequestMapping("/exponent")
    public double exponent(double base, int exponent) {
        return service.exponent (base, exponent);
    }

    @RequestMapping("/squareRoot")
    public double squareRoot(double a) {
        return service.squareRoot (a);
    }
}