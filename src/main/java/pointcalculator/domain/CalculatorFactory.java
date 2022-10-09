package pointcalculator.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class CalculatorFactory {
    private static final Map<Integer, Function<List<Point>, Calculator>> factoryMap = new HashMap<>();

    static {
        factoryMap.put(LineCalculator.LINE_POINT_SIZE, LineCalculator::new);
        factoryMap.put(RectangleCalculator.RECTANGLE_POINT_SIZE, RectangleCalculator::new);
        factoryMap.put(TriangleCalculator.TRIANGLE_POINT_SIZE, TriangleCalculator::new);
    }

    private CalculatorFactory() {
        throw new RuntimeException("접근 할 수 없습니다.");
    }

    public static Calculator create(final List<Point> points) {
        Function<List<Point>, Calculator> function = factoryMap.get(points.size());
        if (function == null) {
            throw new IllegalArgumentException("계산을 지원하지 않는 형식입니다.");
        }
        return function.apply(points);
    }
}
