package ExercisesCodeWars.Kyu7.all_star_code_22;

public class TimeConverter {

    public static String toTime(int seconds){

        int hours = seconds / 3600;
        int minutes = (seconds % 3600)/60;

        String result = hours + " hour(s) and " + minutes+ " minute(s)";

        return result;
    }
}

