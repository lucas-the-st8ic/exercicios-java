package ExercisesCodeWars.Kyu8.battery_bars;

public class Kata {

    public static String batteryBars(int percent) {

        if(percent <= 0 && percent <= 19) {
            return "[.....]";
        } else if (percent >= 20 && percent <= 69) {
            return "[#....]";
        } else if (percent >= 70 && percent <= 99) {
            return "[###..]";
        } else if (percent >= 100) {
            return "[#####]";
        } else {
            return "Not found";
        }
    }
}
