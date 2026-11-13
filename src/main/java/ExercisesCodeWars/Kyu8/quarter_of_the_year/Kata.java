package ExercisesCodeWars.Kyu8.quarter_of_the_year;

public class Kata {
    public static int quarterOf(int month) {
        int quarterOfTheYear = 0;
        switch (month) {
            case 1, 2, 3:
                quarterOfTheYear = 1;
                break;
            case 4, 5, 6:
                quarterOfTheYear = 2;
                break;
            case 7, 8, 9:
                quarterOfTheYear = 3;
                break;
            case 10, 11, 12:
                quarterOfTheYear = 4;
                break;

            default:
                System.out.println("Insert a valid month");
                break;
        }

        return quarterOfTheYear;
    }

/*
    public static int quarterOf(int month) {
        return switch (month) {
            case 1, 2, 3 -> 1;
            case 4, 5, 6 -> 2;
            case 7, 8, 9 -> 3;
            case 10, 11, 12 -> 4;
            default -> {
                System.out.println("Insert a valid month");
                yield 0;
            }
        };
    }
*/

/*
    public class Kata {
        public static int quarterOf(int month) {
            return month <= 3 ? 1 : month <= 6 ? 2 : month <= 9 ? 3 : 4;
        }
    }
*/
}

