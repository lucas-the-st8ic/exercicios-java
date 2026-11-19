package ExercisesCodeWars.Kyu7.sum_of_odd_numbers;

public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        if (n == 1) return 1;

        int quantityOfLastOddNumbers = (n - 1) * n / 2;
        int firstOdd = quantityOfLastOddNumbers * 2 + 1;

        int sum = firstOdd;
        int currentOdd = firstOdd;

        for (int i = 1; i < n; i ++) {

            currentOdd += 2;
            sum += currentOdd;
        }

        return sum;
    }
}
