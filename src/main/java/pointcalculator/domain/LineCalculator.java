package pointcalculator.domain;

import java.util.List;

public class LineCalculator implements Calculator {
    public static final int LINE_POINT_SIZE = 2;
    private final List<Point> points;

    public LineCalculator(List<Point> points) {
        validatePointsSize(points);
        this.points = points;
    }

    @Override
    public double calculate() {
        Point a = points.get(0);
        Point b = points.get(1);
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    @Override
    public void printResult(final double result) {
        System.out.println("두 점 사이 거리는 " + String.format("%.6f", result));
    }

    private void validatePointsSize(final List<Point> points) {
        if (points.size() != LINE_POINT_SIZE) {
            throw new IllegalArgumentException("올바른 선 길이 계산 형식이 아닙니다.");
        }
    }
}
