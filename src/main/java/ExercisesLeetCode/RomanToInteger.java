package ExercisesLeetCode;

import java.util.Map;

public class RomanToInteger {
    private static final Map<Character, Integer> NUMERAIS_ROMANOS = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000);

    public int romanToInt(String s) {
        int result = 0;
        int previousValue = 0;

        for (int i = s.length() - 1; i >= 0; i --) {
            char currentChar = s.charAt(i);
            int value = NUMERAIS_ROMANOS.get(currentChar);

            if (value < previousValue) {
                result -= value;
            } else {
                result += value;
            }
            previousValue = value;
        }
        return result;
    }
}
