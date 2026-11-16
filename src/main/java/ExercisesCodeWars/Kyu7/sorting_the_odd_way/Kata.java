package ExercisesCodeWars.Kyu7.sorting_the_odd_way;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {

    public static Double[] sortItOut(Double[] array) {
        List<Double> pares = new ArrayList<>();
        List<Double> impares = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {

            int numero = (int) Math.floor(array[i]);
            if (numero % 2 == 0) {
                pares.add(array[i]);
            } else {
                impares.add(array[i]);
            }
        }
        Collections.sort(pares, Collections.reverseOrder());
        Collections.sort(impares);

       impares.addAll(pares);

       return impares.toArray(new Double[0]);
    }

/*
     public static Double[] sortItOut(Double[] array) {
        Stream<Double> even = Arrays.stream(array).filter(x -> x.intValue() % 2 == 0).sorted(Comparator.reverseOrder());
            Stream<Double> uneven = Arrays.stream(array).filter(x -> x.intValue() % 2 != 0).sorted();
            return Stream.concat(uneven, even).toArray(Double[]::new);
      }
============================
     public static Double[] sortItOut(Double[] array) {
        List<Double> listOfOdds = new ArrayList<>(Arrays.stream(array)
                .filter(x-> Math.floor(x)%2!=0)
                .sorted(Comparator.naturalOrder()).toList());
        List <Double> listOfEvens = new ArrayList<>(Arrays.stream(array)
                .filter(x-> Math.floor(x)%2==0)
                .sorted(Comparator.reverseOrder()).toList());
        listOfOdds.addAll(listOfEvens);
        return  listOfOdds.toArray(new Double[0]);
    }
==========================
       public static Double[] sortItOut(Double[] array) {
        return Stream.concat(
                    Arrays.stream(array).filter(a -> Math.floor(a) % 2 == 1).sorted(),
                    Arrays.stream(array).filter(a -> Math.floor(a) % 2 == 0).sorted(Comparator.reverseOrder())
                ).toArray(Double[]::new);
    }

*/

}

