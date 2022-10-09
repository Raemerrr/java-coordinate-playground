package pointcalculator.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RectangleCalculator implements Calculator {
    public static final int RECTANGLE_POINT_SIZE = 4;
    private final List<Point> points;

    public RectangleCalculator(final List<Point> points) {
        validatePointsSize(points);
        validateRectanglePointsPosition(points);
        this.points = points;
    }

    @Override
    public double calculate() {
        List<Integer> distinctSortedYList = points.stream()
                .map(Point::getY)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        List<Integer> distinctSortedXList = points.stream()
                .map(Point::getX)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return ((distinctSortedYList.get(1) - distinctSortedYList.get(0)) *
                (distinctSortedXList.get(1) - distinctSortedXList.get(0)));
    }

    @Override
    public void printResult(final double result) {
        System.out.println("사각형 넓이는 " + String.format("%.0f", result));
    }

    private void validatePointsSize(final List<Point> points) {
        if (points.size() != RECTANGLE_POINT_SIZE) {
            throw new IllegalArgumentException("올바른 선 길이 계산 형식이 아닙니다.");
        }
    }

    private void validateRectanglePointsPosition(final List<Point> points) {
        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();
        for (final Point point : points) {
            xSet.add(point.getX());
            ySet.add(point.getY());
        }
        if (xSet.size() != 2 || ySet.size() != 2) {
            throw new IllegalArgumentException("직사각형 좌표 입력이 아닙니다.");
        }
    }
}
