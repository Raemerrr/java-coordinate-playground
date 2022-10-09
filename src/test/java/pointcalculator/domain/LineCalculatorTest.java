package pointcalculator.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LineCalculatorTest {

    @Test
    @DisplayName("직선 계산기 정상")
    void 직선_계산기_정상() {
        Calculator calculator = new LineCalculator(Arrays.asList(new Point(10, 10), new Point(14, 15)));
        assertEquals(6.403, calculator.calculate(), 0.001);
    }
}