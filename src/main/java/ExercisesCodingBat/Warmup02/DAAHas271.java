/*Given an array of ints, return true if it
contains a 2, 7, 1 pattern: a value,
followed by the value plus 5,
followed by the value minus 1.
Additionally the 271 counts even if the "1"
differs by 2 or less from the correct value.

Dado um array de inteiros, retorne verdadeiro se ele
contiver o padrão 2, 7, 1: um valor, seguido pelo valor
mais 5, seguido pelo valor menos 1. Além disso,
o padrão 2-7-1 é considerado válido mesmo que o "1"
difira em 2 ou menos do valor correto.

has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true

*/

void main(String[] args) {
    has271(new int[]{1, 2, 7, 1});  // → true
    has271(new int[]{1, 2, 8, 1});  // → false
    has271(new int[]{2, 7, 1});  //→ true
}

public boolean has271(int[] numbers) {
    for (int i = 0; i < numbers.length - 2; i++) {
        if (numbers[i + 1] == numbers[i] + 5
        && Math.abs(numbers[i + 2] - (numbers[i] - 1)) <= 2) {
            return true;
        }
    }
    return false;
}
/*
X
X + 5
X - 1
*/