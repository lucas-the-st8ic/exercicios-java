package ExercisesCodeWars.Kyu8.expressions_matter;

public class Kata {
    public static int expressionsMatter(int a, int b, int c) {
       int dupla1 = Math.max(a + b + c, a + b * c);
       int dupla2 = Math.max(a * b + c, a * b * c);
       int dupla3 = Math.max((a + b) * c, a * (b + c));

       int result = Math.max(dupla1, Math.max(dupla2, dupla3));

       return result;
    }
}

