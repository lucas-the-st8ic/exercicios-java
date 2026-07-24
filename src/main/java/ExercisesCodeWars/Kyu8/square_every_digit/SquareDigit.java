package ExercisesCodeWars.Kyu7.square_every_digit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareDigit {

    public int squareDigits(int num) {
        List<String> stringNums = Arrays.asList(String.valueOf(num).split(""));

        List<Integer> numbers = new ArrayList<>();
        for (String stringNum : stringNums) {
            numbers.add(Integer.valueOf(stringNum));
        }

        System.out.println(numbers);
        int numeroFinal = numbers.stream()
                .map(n -> n * n)
                .map(r ->String.valueOf(r.intValue()))
                .collect(java.util.stream.Collectors.joining())
                .transform(Integer::parseInt);

        System.out.println(numeroFinal);

        return numeroFinal;
    }
}
