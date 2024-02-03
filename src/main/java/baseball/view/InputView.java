package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String getUsersNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();

        return input;
    }

    public String reStartOrExit() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String reStart = Console.readLine();

        return reStart;
    }

}
