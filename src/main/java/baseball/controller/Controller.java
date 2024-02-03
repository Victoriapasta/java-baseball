package baseball.controller;

import baseball.model.CaculateResult;
import baseball.model.GeneratedSecretNumbers;
import baseball.util.InputValidator;
import baseball.util.ToIntegerArray;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;

public class Controller {

    private final InputView inputView;
    private final OutputView outputView;

    public Controller(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        outputView.printStartMessage();

        do {
            List<Integer> answer = initAnswer();
            roundStart(answer);
        } while (inputView.reStartOrExit().equals("1"));
    }

    private void roundStart(List<Integer> answer) {
        while (true) {
            String input = inputView.getUsersNumbers();
            InputValidator.validate(input);
            List<Integer> userGuess = ToIntegerArray.toIntegerArray(input);

            List<Integer> calculatedResult = calculateResult(answer, userGuess);

            outputView.printResultMessage(calculatedResult);
            if (isAnswer(calculatedResult)) {
                outputView.printEndMessage();
                break;
            }
        }
    }

    public boolean isAnswer(List<Integer> result) {
        if (result.get(0) == 3) {
            return true;
        }
        return false;
    }

    private List<Integer> initAnswer() {
        GeneratedSecretNumbers generatedSecretNumbers = new GeneratedSecretNumbers();
        List<Integer> answer = generatedSecretNumbers.generateAnswer();
        return answer;
    }

    private List<Integer> calculateResult(List<Integer> answer, List<Integer> userGuess) {
        CaculateResult caculateResult = new CaculateResult();
        List<Integer> result = caculateResult.calculateResult(answer, userGuess);
        return result;
    }
}
