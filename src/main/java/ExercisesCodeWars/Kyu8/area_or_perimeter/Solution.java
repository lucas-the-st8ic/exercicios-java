package ExercisesCodeWars.Kyu8.area_or_perimeter;

import java.util.HashMap;

public class Solution {
    public static int areaOrPerimeter (int length, int width) {
        int result = 0;
        if (length == width) {
            result = length * width;
        } else {
            result = (length + width) * 2;
        }
        return result;
    }


}

/*public static int areaOrPerimeter2 (int length, int width) {
        return length == width ? length * width : (length + width) * 2;
}*/

