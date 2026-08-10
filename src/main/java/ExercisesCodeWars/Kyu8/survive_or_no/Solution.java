package ExercisesCodeWars.Kyu8.survive_or_no;

public class Solution {
    public static boolean hero(int bullets, int dragons) {
        return dragons * 2 <= bullets ? true : false;
    }
}
