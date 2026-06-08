/*
We'll say that a number is "teen" if it is in
the range 13..19 inclusive. Given 3 int values,
return true if 1 or more of them are teen.

Consideraremos um número "adolescente" se estiver no
intervalo de 13 a 19, inclusive. Dados 3 valores inteiros,
retorne verdadeiro se um ou mais deles forem adolescentes.

hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
*/
void main(String[] args) {
    hasTeen(13, 20, 10);
    hasTeen(20, 19, 10);
    hasTeen(15, 19, 28);
}
/*CodingBat Solution:
// Here it is written as one big expression,
 // vs. a series of if-statements.
    public boolean hasTeen(int a, int b, int c) {

      return (a>=13 && a<=19) ||
             (b>=13 && b<=19) ||
             (c>=13 && c<=19);
    }
*/
public boolean hasTeen(int a, int b, int c) {
    boolean result = ((a >= 13 && a <= 19) ||
            (b >= 13 && b <= 19) ||
            (c >= 13 && c <= 19));
    System.out.println(result);

    return ((a >= 13 && a <= 19) ||
            (b >= 13 && b <= 19) ||
            (c >= 13 && c <= 19));

}
