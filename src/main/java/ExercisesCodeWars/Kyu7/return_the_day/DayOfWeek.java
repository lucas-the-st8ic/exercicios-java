package ExercisesCodeWars.Kyu7.return_the_day;

public class DayOfWeek {
    public static String getDay(int n) {
            String dayOfTheWeek;
            switch(n) {
                case 1 :
                    dayOfTheWeek = "Sunday";
                    break;
                case 2 :
                    dayOfTheWeek = "Monday";
                    break;
                case 3 :
                    dayOfTheWeek = "Tuesday";
                    break;
                case 4 :
                    dayOfTheWeek = "Wednesday";
                    break;
                case 5 :
                    dayOfTheWeek = "Thursday";
                    break;
                case 6 :
                    dayOfTheWeek = "Friday";
                    break;
                case 7 :
                    dayOfTheWeek = "Saturday";
                    break;
                default:
                    dayOfTheWeek = "Wrong, please enter a number between 1 and 7.";
                    break;
            }
        System.out.println(dayOfTheWeek);
        return dayOfTheWeek;
    }
}

