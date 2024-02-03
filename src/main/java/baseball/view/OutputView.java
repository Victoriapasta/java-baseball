package baseball.view;

import java.util.List;

public class OutputView {

    public void printStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다!");
    }

    public void printResultMessage(List<Integer> result) {
        if (result.get(0) == 0 && result.get(1) != 0) {
            System.out.println(result.get(1) + "볼");
            return;
        }
        if (result.get(0) == 0 && result.get(1) == 0) {
            System.out.println("낫싱");
            return;
        }
        if (result.get(0) != 0 && result.get(1) != 0) {
            System.out.println(result.get(1) + "볼 " + result.get(0) + "스트라이크");
            return;
        }
        System.out.println(result.get(0) + "스트라이크");
    }

    public void printEndMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
