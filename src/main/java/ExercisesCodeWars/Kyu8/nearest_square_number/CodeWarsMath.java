package ExercisesCodeWars.Kyu8.nearest_square_number;

public class CodeWarsMath {

    public static int nearestSqr(final int n) {

        // Calcula a raiz quadrada do número fornecido
        double sqrt = Math.sqrt(n);

        // Se a raiz quadrada for um número inteiro, então
        // n já é um quadrado perfeito (ex.: 64, 81, 144...)
        if (sqrt == (int) sqrt) {
            return n;
        }

        // Obtém o inteiro imediatamente abaixo da raiz
        // Ex.: sqrt(111) = 10.53 -> floor = 10
        int floor = (int) Math.floor(sqrt);

        // Obtém o inteiro imediatamente acima da raiz
        // Ex.: sqrt(111) = 10.53 -> ceil = 11
        int ceil = (int) Math.ceil(sqrt);

        // Calcula o quadrado perfeito inferior mais próximo
        // Ex.: 10² = 100
        int floorPow = floor * floor;

        // Calcula o quadrado perfeito superior mais próximo
        // Ex.: 11² = 121
        int ceilPow = ceil * ceil;

        // Compara a distância entre n e os dois quadrados perfeitos.
        // Math.abs() garante que estamos comparando apenas a distância,
        // sem nos preocupar com números negativos.
        if (Math.abs(n - floorPow) < Math.abs(n - ceilPow)) {
            return floorPow;
        }

        // Se não for mais próximo do quadrado inferior,
        // retorna o quadrado superior.
        return ceilPow;
    }
}
