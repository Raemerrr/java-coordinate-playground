package pointcalculator.domain;

import java.util.List;

public class CalculatorFactory {

    public Calculator createCalculator(final List<Point> points) {
        if (points.size() == LineCalculator.LINE_POINT_SIZE) {
            return new LineCalculator(points);
        }
        throw new IllegalArgumentException("계산을 지원하지 않는 형식입니다.");
    }
}
