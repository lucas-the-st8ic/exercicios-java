
/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 2 int values, return true if one or the other is teen, but not both.

Consideraremos um número como "adolescente" se estiver no intervalo
de 13 a 19, inclusive. Dados dois valores inteiros, retorne verdadeiro
se um deles for adolescente, mas não ambos.

loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
*/

void main(String[] args) {
    loneTeen(13, 99);
    loneTeen(21, 99);
    loneTeen(99, 13);
    loneTeen(13, 13);
    loneTeen(19, 19);
    loneTeen(12, 13);
    loneTeen(19, 20);
}
/*CodingBat solution:
    public boolean loneTeen(int a, int b) {
      // Store teen-ness in boolean local vars first. Boolean local
      // vars like this are a little rare, but here they work great.
      boolean aTeen = (a >= 13 && a <= 19);
      boolean bTeen = (b >= 13 && b <= 19);

      return (aTeen && !bTeen) || (!aTeen && bTeen);
      // Translation: one or the other, but not both.
      // Alternately could use the Java xor operator, but it's obscure.
    }
*/
public boolean loneTeen(int num_1, int num_2) {

    return (((num_1 >= 13 && num_1 <= 19) &&
            (num_2 >= 13 && num_2 <= 19)) ^
            ((num_1 >= 13 && num_1 <= 19) ||
                    (num_2 >= 13 && num_2 <= 19)));
}
