package ExercisesCodeWars.Kyu8.is_divisible;

public class DivisibleNb {
    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }
}

