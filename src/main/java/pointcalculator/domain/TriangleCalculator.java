package pointcalculator.domain;

import java.util.List;

public class TriangleCalculator implements Calculator {
    public static final int TRIANGLE_POINT_SIZE = 3;
    private final List<Point> points;

    public TriangleCalculator(final List<Point> points) {
        validatePointsSize(points);
        this.points = points;
    }

    @Override
    public double calculate() {
        Point a = points.get(0);
        Point b = points.get(1);
        Point c = points.get(2);
        double ab = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
        double bc = Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2));
        double ca = Math.sqrt(Math.pow(c.getX() - a.getX(), 2) + Math.pow(c.getY() - a.getY(), 2));
        return heronsFormula(ab, bc, ca);
    }

    @Override
    public void printResult(double result) {
        System.out.println("삼각형 넓이는 " + String.format("%.1f", result));
    }

    private void validatePointsSize(final List<Point> points) {
        if (points.size() != TRIANGLE_POINT_SIZE) {
            throw new IllegalArgumentException("올바른 선 길이 계산 형식이 아닙니다.");
        }
    }

    private double heronsFormula(final double ab, final double bc, final double ca) {
        double d = Math.pow((Math.pow(ab, 2) + Math.pow(bc, 2) + Math.pow(ca, 2)), 2)
                - ((Math.pow(ab, 4) + Math.pow(bc, 4) + Math.pow(ca, 4)) * 2);
        return Math.sqrt(d) / 4;
    }
}
