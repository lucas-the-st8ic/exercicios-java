package ExercisesCodeWars.Kyu7.arithmetic_progression;

/*class Progression {

    public static String arithmeticSequenceElements(int a, int d, long n) {

        StringJoiner sj = new StringJoiner(", ");

        for (long i = 0; i < n ; i++) {
            sj.add(String.valueOf(a));
            a += d;
        }

        return sj.toString();
    }

}*/

class Progression {

    public static String arithmeticSequenceElements(int a, int d, long n) {
        StringBuilder stringBuilder = new StringBuilder();

        for (long i = 0; i < n; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(a);
            a += d;
        }
        return stringBuilder.toString();
    }
}

/*
import static java.util.stream.IntStream.iterate;
import static java.util.stream.Collectors.joining;

public class Progression {

  public static String arithmeticSequenceElements(int a, int d, long n) {
    return iterate(a, t -> t + d).limit(n).mapToObj(Integer::toString).collect(joining(", "));
  }
}
*/

/*
import java.util.stream.Collectors;
import java.util.stream.LongStream;

class Progression {

  public static String arithmeticSequenceElements(int first, int step, long total) {
    return LongStream.range(0, total)
      .map(i -> first + step * i)
      .mapToObj(Long::toString)
      .collect(Collectors.joining(", "));
  }

}

*/