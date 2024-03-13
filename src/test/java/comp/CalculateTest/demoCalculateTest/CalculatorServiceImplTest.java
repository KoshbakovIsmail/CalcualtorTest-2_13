package comp.CalculateTest.demoCalculateTest;


import comp.CalculateTest.demoCalculateTest.servaices.CalculatorServaiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplTest {
    private CalculatorServaiceImpl calculatorServiceImpl;
    private final int firstValue = 10;
    private final int secondValue = 2;
    private final int zero = 0;

    @BeforeEach
    public void setUp() {
        calculatorServiceImpl = new CalculatorServaiceImpl();
    }

    @Test
    public void testGetWellcome() {
        assertEquals("Wellcome calculator!!!", calculatorServiceImpl.getWellcome());
    }

    @Test
    public void testPlus() {
        assertEquals("10+2=12", calculatorServiceImpl.plus(firstValue, secondValue));
    }

    @Test
    public void testMinus() {
        assertEquals("10-2=8", calculatorServiceImpl.minus(firstValue, secondValue));
    }

    @Test
    public void testMultiply() {
        assertEquals("10*2=20", calculatorServiceImpl.multiply(firstValue, secondValue));
    }

    @Test
    public void testDivide() {
        assertEquals("10/2=5", calculatorServiceImpl.divide(firstValue, secondValue));
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorServiceImpl.divide(firstValue, zero));
    }


}
