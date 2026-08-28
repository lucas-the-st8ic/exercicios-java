package ExercisesCodeWars.Kyu8.powers_of_2;

public class Kata {
    public static long[] powersOfTwo(int n) {

            long[] result = new long[n + 1];
            for (int i = 0; i <= n; i++) {
                long num = (long) Math.pow(2, i);
                result[i] = (long) num;
            }
            return result;
    }
}
