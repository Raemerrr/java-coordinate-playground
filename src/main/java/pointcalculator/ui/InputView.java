package pointcalculator.ui;

import pointcalculator.domain.Calculator;
import pointcalculator.domain.CalculatorFactory;
import pointcalculator.domain.Point;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String USER_INPUT_DELIMITER = "-";
    private static final String POINT_FORMAT_REGEX = "\\([0-9]+,[0-9]+\\)";
    private static final String POINT_DELIMITER = ",";
    private static final CalculatorFactory factory = new CalculatorFactory();

    public static Calculator userPoint() {
        System.out.println("좌표를 입력하세요.");
        List<String> splitData = splitUserInput(scanner.nextLine());
        List<Point> points = splitData.stream()
                .map(InputView::parsePoint)
                .collect(Collectors.toList());
        return factory.createCalculator(points);
    }

    private static List<String> splitUserInput(final String input) {
        return Arrays.asList(input.split(USER_INPUT_DELIMITER));
    }

    private static Point parsePoint(final String data) {
        validatePointFormat(data);
        List<String> pointData = Arrays.asList(data.split(POINT_DELIMITER));
        String xString = pointData.get(0);
        String yString = pointData.get(1);
        int x = Integer.parseInt(xString.substring(1));
        int y = Integer.parseInt(yString.substring(0, yString.length() - 1));
        return new Point(x, y);
    }

    private static void validatePointFormat(final String data) {
        if (!data.matches(POINT_FORMAT_REGEX)) {
            throw new IllegalArgumentException("옳지 않은 입력입니다.");
        }
    }
}
