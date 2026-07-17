package ExercisesCodeWars.Kyu7.vowel_count;

public class Vowels {

    public static int getCount(String string) {
        int count = 0;

        for (int i = 0; i < string.length() - 1; i++) {
            switch (string.charAt(i)) {
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
                default:
                    break;
            }
        }

        return count;
    }
}
