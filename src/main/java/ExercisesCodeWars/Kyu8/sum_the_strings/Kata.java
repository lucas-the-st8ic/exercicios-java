package ExercisesCodeWars.Kyu8.sum_the_strings;

public class Kata{

    public static String sumStr(String a, String b){

        if (a.isEmpty()) a = "0";
        if (b.isEmpty()) b = "0";



        return String
                .valueOf(Integer.parseInt(a) +
                        Integer.parseInt(b));
    }

}
