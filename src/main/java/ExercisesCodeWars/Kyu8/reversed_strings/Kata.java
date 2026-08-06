package ExercisesCodeWars.Kyu8.reversed_strings;

public class Kata {
    public static String solution(String string) {
        String reversedString= "";
        for (int i = string.length(); i >= 0; i --) {
            reversedString += string.charAt(i);
        }
        return reversedString;
    }
}
