package ExercisesCodeWars.Kyu8.opposites_attract;

public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
        String [] frases = {"I love you","a little","a lot","passionately",
                "madly",
                "not at all"};

        if (nb_petals <= frases.length) {
            return frases[nb_petals - 1];
        }

        return frases[(nb_petals - 1) % frases.length];

    }
}
