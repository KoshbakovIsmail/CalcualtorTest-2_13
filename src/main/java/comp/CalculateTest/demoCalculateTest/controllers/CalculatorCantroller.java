package comp.CalculateTest.demoCalculateTest.controllers;

import comp.CalculateTest.demoCalculateTest.servaices.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorCantroller {
    private final CalculatorService calculatorService;

    public CalculatorCantroller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String wellcome() {
        return calculatorService.getWellcome();
    }

    @GetMapping("/plus")
    public String add(@RequestParam("number1") int number1, @RequestParam("number2") int number2) {
        return calculatorService.plus(number1, number2);
    }

    @GetMapping("minus")
    public String minus(@RequestParam("number1") int number1, @RequestParam("number2") int number2) {
        return calculatorService.minus(number1, number2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("number") int number1, @RequestParam("number2") int number2) {
        return calculatorService.multiply(number1, number2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("number1") int number1, @RequestParam("number2") int number2) {
        return calculatorService.divide(number1, number2);
    }
}
