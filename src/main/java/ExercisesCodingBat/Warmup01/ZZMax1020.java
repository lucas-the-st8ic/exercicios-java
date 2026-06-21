/* Given 2 positive int values, return the larger value that is
in the range 10..20 inclusive, or return 0 if neither is in that range.

Dados dois valores inteiros positivos, retorne o maior valor que
esteja no intervalo de 10 a 20 (inclusive), ou retorne 0 se nenhum
estiver nesse intervalo.

max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11

*/

void main(String[] args) {
    max1020(11, 19);
    max1020(19, 11);
    max1020(11, 9);
}

public int max1020(int num_1, int num_2) {
    if ((num_1 >= 10 && num_1 <= 20) && (num_2 >= 10 && num_2 <= 20)) {
        return Math.max(num_1, num_2);
    }

    if (num_1 >= 10 && num_1 <= 20) {
        return num_1;
    }
    if (num_2 >= 10 && num_2 <= 20) {
        return num_2;
    }
    return 0;
}