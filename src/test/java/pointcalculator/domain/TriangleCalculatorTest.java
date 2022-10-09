package pointcalculator.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleCalculatorTest {

    @Test
    @DisplayName("삼각형 넓이 계산기 정상")
    void 삼각형_넓이_계산기_정상() {
        Calculator calculator = new TriangleCalculator(Arrays.asList(new Point(10, 10), new Point(14, 15), new Point(20, 8)));
        assertEquals(29.0, calculator.calculate(), 0.1);
    }
}
