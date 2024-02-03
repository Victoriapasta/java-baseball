package baseball.util;

public class InputValidator {

    private InputValidator(){}

    public static void validate(String input) {
        // 입력값이 3자리 숫자가 아닌 경우 예외처리
        if (!input.matches("[1-9]{3}")) {
            throw new IllegalArgumentException();
        }
    }
}
