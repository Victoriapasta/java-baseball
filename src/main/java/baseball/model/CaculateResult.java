package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class CaculateResult {

    public static List<Integer> calculateResult(List<Integer> secretNumber, List<Integer> userGuess) {
        List<Integer> result = new ArrayList<>();
        // result[0]: 스트라이크 개수, result[1]: 볼 개수

        result.add(0);
        result.add(0);

        for (int i = 0; i < 3; i++) {
            if (secretNumber.get(i) == userGuess.get(i)) {
                result.set(0, result.get(0) + 1);
            } else if (checkBall(secretNumber, userGuess.get(i))) {
                result.set(1, result.get(1) + 1); // 볼
            }
        }
        return result;
    }

    private static boolean checkBall(List<Integer> array, int value) {
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

}
