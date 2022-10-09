package pointcalculator.ui;

import pointcalculator.domain.Calculator;

public class ResultView {
    public static void printResult(final Calculator calculator) {
        double result = calculator.calculate();
        calculator.printResult(result);
    }
}
