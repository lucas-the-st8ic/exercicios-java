package ExercisesCodeWars.Kyu8.counting_sheep;

public class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != null && arrayOfSheeps[i].equals(true)) { count++;}
        }
        return count;
    }

    public static int countSheeps2(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (Boolean.TRUE.equals(arrayOfSheeps[i])){ count++;}
        }
        return count;
    }
}




