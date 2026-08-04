package ExercisesCodeWars.Kyu8.counting_sheep;

public class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i].equals(true)
                    && arrayOfSheeps[i] != null) { count++;}
        }
        return count;
    }
}
