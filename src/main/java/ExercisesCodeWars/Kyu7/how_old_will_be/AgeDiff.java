package ExercisesCodeWars.Kyu7.how_old_will_be;

public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        int difference = Math.abs(birth - yearTo);
        String wordYear = difference == 1 ? " year" : " years";
        if(birth == yearTo) {
            return "You were born this very year!";
        } else if(birth > yearTo) {
            return "You will be born in " +difference+ wordYear+ ".";
        } else {
            return "You are " +difference+ wordYear+ " old.";
        }
    }

/* Outra solução com menos linhas de código:

public class AgeDiff {
  public static String CalculateAge(int birth, int year) {
    final int age = year - birth;
    return
      age == 0 ? "You were born this very year!" :
      age > 0 ? String.format("You are %d year%s old.", age, age == 1 ? "" : "s") :
      String.format("You will be born in %d year%s.", -age, -age == 1 ? "" : "s");
  }
}
*/
}
