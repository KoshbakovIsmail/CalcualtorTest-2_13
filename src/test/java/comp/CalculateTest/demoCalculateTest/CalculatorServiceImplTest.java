package comp.CalculateTest.demoCalculateTest;

import comp.CalculateTest.demoCalculateTest.servaices.CalculatorServaiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplTest {
    private CalculatorServaiceImpl calculatorServiceImpl;

    @BeforeEach
    public void setUp() {
        calculatorServiceImpl = new CalculatorServaiceImpl();
    }

    @ParameterizedTest
    @CsvSource({"Wellcome calculator!!!", "Wellcome calculator!!!"})
    public void testGetWellcome(String expectedWellcome) {
        assertEquals(expectedWellcome, calculatorServiceImpl.getWellcome());
    }

    @ParameterizedTest
    @CsvSource({"10,2,12", "8,2,10", "6,2,8"})
    public void testPlus(int firstValue, int secondValue, int expectedResult) {
        assertEquals(firstValue + "+" + secondValue + "=" + expectedResult, calculatorServiceImpl.plus(firstValue, secondValue));
    }

    @ParameterizedTest
    @CsvSource({"10,2,8", "8,2,6", "6,2,4"})
    public void testMinus(int firstValue, int secondValue, int expectedResult) {
        assertEquals(firstValue + "-" + secondValue + "=" + expectedResult, calculatorServiceImpl.minus(firstValue, secondValue));
    }

    @ParameterizedTest
    @CsvSource({"10,2,20", "8,2,16", "6,2,12"})
    public void testMultiply(int firstValue, int secondValue, int expectedResult) {
        assertEquals(firstValue + "*" + secondValue + "=" + expectedResult, calculatorServiceImpl.multiply(firstValue, secondValue));
    }

    @ParameterizedTest
    @CsvSource({"10,2,5,true", "8,2,4,true", "6,2,3,true", "6,0,0,false"})
    public void testDivide(int firstValue, int secondValue, int expectedResult, boolean expectException) {
        if (expectException) {
            assertEquals(firstValue + "/" + secondValue + "=" + expectedResult, calculatorServiceImpl.divide(firstValue, secondValue));
        } else {
            assertThrows(IllegalArgumentException.class, () -> calculatorServiceImpl.divide(firstValue, secondValue));
        }
    }

}
