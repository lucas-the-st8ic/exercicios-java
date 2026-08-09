package ExercisesCodeWars.Kyu8.chromosomes;

public class Kata {
    public static String chromosomeCheck(String sperm) {
        String[] chromosomes = sperm.split("");
        if ("X".equalsIgnoreCase(chromosomes[0])
        && "X".equalsIgnoreCase(chromosomes[1])) {
            return "Congratulations! You're going to have a daughter.";
        }
        return "Congratulations! You're going to have a son.";
    }

    public static String chromosomeCheck2(String sperm) {
        String daughter = "Congratulations! You're going to have a daughter.";
        String son = "Congratulations! You're going to have a son.";
        String[] chromosomes = sperm.split("");

        return chromosomes[0].equalsIgnoreCase("X") &&
                chromosomes[1].equalsIgnoreCase("X") ? daughter : son;

    }

}
