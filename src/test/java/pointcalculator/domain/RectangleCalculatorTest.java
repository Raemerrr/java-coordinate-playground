package pointcalculator.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleCalculatorTest {

    @Test
    @DisplayName("사각형 넓이 계산기 정상")
    void 사각형_넓이_계산기_정상() {
        Calculator calculator = new RectangleCalculator(Arrays.asList(new Point(10, 10), new Point(22, 10), new Point(22, 18), new Point(10, 18)));
        assertEquals(96, calculator.calculate());
    }
}
