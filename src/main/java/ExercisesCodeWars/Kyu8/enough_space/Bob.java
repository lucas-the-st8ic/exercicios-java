package ExercisesCodeWars.Kyu8.enough_space;

public class Bob {
    public static int enough(int cap, int on, int wait){
        int availableSeats = cap - on;
        if (availableSeats >= wait) {
            return 0;
        } else {
            return wait- availableSeats;
        }

    }
}
