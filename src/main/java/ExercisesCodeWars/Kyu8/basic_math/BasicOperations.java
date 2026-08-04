package ExercisesCodeWars.Kyu8.basic_math;

public class BasicOperations {
    public static Integer basicMath(String operation,
                                    int number1, int number2) {
        int result = 0;
        switch (operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            default:
                result = 0;
                System.out.println("Operação inválida!");
        }
        return result;
    }
}
