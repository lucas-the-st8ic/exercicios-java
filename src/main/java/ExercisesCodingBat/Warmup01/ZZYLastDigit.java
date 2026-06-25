/*Given two non-negative int values, return true
if they have the same last digit, such as with 27 and 57.
Note that the % "mod" operator
computes remainders, so 17 % 10 is 7.

Dados dois valores inteiros não negativos, retorne
verdadeiro se eles tiverem o mesmo último dígito,
como ocorre com 27 e 57.
Observe que o operador % ("mod") calcula o
resto da divisão; portanto, 17 % 10 é igual a 7.

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
*/
void main(String[] args) {
    lastDigit(7, 17);
    lastDigit(3, 113);
    lastDigit(6, 17);

}

public boolean lastDigit(int num_1, int num_2) {
    IO.println((num_1 % 10 == num_2 % 10));
    return (num_1 % 10 == num_2 % 10);
}
