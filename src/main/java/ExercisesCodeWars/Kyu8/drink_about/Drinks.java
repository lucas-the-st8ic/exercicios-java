package ExercisesCodeWars.Kyu8.drink_about;

public class Drinks{
    public static String peopleWithAgeDrink(int age){
        if (age < 14) {
            return "drink toddy";
        }else if (age < 18) {
            return "drink coke";
        } else if(age < 21) {
            return "drink beer";
        } else {
            return "drink whisky";
        }
    }
}
