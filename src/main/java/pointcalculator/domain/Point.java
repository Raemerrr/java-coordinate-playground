package pointcalculator.domain;

public class Point {
    private static final int POINT_MIN_NUM = 0;
    private static final int POINT_MAX_NUM = 24;
    private final int x;
    private final int y;

    public Point(final int x, final int y) {
        validatePointRange(x, y);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private void validatePointRange(final int x, final int y) {
        if (x < POINT_MIN_NUM || y < POINT_MIN_NUM || POINT_MAX_NUM < x || POINT_MAX_NUM < y) {
            throw new IllegalArgumentException("좌표 값은 " + POINT_MIN_NUM + " ~ " + POINT_MAX_NUM + "사이의 값만 입력 가능합니다.");
        }
    }
}
