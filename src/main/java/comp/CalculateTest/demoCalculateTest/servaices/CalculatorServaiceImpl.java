package comp.CalculateTest.demoCalculateTest.servaices;


import org.springframework.stereotype.Service;

@Service
public class CalculatorServaiceImpl implements CalculatorService {
    @Override
    public String getWellcome() {
        return "Wellcome calculator!!!";
    }

    @Override
    public String plus(int number1, int number2) {
        int result = number1 + number2;
        return number1 + "+" + number2 + "=" + result;
    }

    @Override
    public String minus(int number1, int number2) {
        int result = number1 - number2;
        return number1 + "-" + number2 + "=" + result;
    }

    @Override
    public String multiply(int number1, int number2) {
        int result = number1 * number2;
        return number1 + "*" + number2 + "=" + result;
    }

    @Override
    public String divide(int number1, int number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!!!");
        }
        int result = number1 / number2;
        return number1 + "/" + number2 + "=" + result;
    }

}
