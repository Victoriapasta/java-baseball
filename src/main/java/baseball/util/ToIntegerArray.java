package baseball.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToIntegerArray {

    private ToIntegerArray() {
    }

    public static List<Integer> toIntegerArray(String input) {
        return Arrays.stream(input.split(""))
                .map(number -> Integer.valueOf(number))
                .collect(Collectors.toList());
    }
}
