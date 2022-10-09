import pointcalculator.domain.Calculator;
import pointcalculator.ui.InputView;
import pointcalculator.ui.ResultView;

public class Application {
    public static void main(String[] args) {
        Calculator calculator;
        do {
            calculator = input();
        } while (calculator == null);
        ResultView.printResult(calculator);
    }

    private static Calculator input() {
        try {
            return InputView.userPoint();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
