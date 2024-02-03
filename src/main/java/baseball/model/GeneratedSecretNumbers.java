package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class GeneratedSecretNumbers {

    public static List<Integer> generateAnswer() {
        List<Integer> secretNumber = new ArrayList<>();
        while (secretNumber.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!secretNumber.contains(randomNumber)) {
                secretNumber.add(randomNumber);
            }
        }
        return secretNumber;
    }
}
