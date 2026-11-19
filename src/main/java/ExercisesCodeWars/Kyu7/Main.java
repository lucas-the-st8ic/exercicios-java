void main(String[] args) {
    rowSumOddNumbers(2);
    rowSumOddNumbers(3);
    rowSumOddNumbers(25);
}

public static int rowSumOddNumbers(int n) {
    System.out.println("=== Calculando para a linha n = " + n + " ===");

    if (n == 1) {
        System.out.println("Caso base (n = 1): retorna 1");
        return 1;
    }

    int quantityOfLastOddNumbers = (n - 1) * n / 2;
    int firstOdd = quantityOfLastOddNumbers * 2 + 1;

    System.out.println("Ímpares nas linhas anteriores: " + quantityOfLastOddNumbers);
    System.out.println("Primeiro ímpar da linha " + n + ": " + firstOdd);
    System.out.println("----------------------------------------");

    int sum = firstOdd;
    int currentOdd = firstOdd;

    System.out.println("Início -> Número atual: " + currentOdd + " | Soma acumulada: " + sum);

    for (int i = 1; i < n; i++) {
        currentOdd += 2;
        sum += currentOdd;
        System.out.println("Volta " + i + " -> Próximo ímpar: " + currentOdd + " | Soma acumulada: " + sum);
    }

    System.out.println("Resultado final da linha " + n + ": " + sum + "\n");
    return sum;
}

