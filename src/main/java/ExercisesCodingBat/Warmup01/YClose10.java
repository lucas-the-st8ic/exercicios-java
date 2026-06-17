/*Given 2 int values, return whichever value is nearest to the
value 10, or return 0 in the event of a tie.
Note that Math.abs(n) returns the absolute value of a number.

Dados dois valores inteiros, retorne o valor mais próximo de 10
ou retorne 0 em caso de empate.
Observe que `Math.abs(n)` retorna o valor absoluto de um número.

close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0

*/

void main(String[] args) {
    close10(8, 13);
    close10(13, 8);
    close10(13, 7);
}

/* CodingBat solution:

      public int close10(int a, int b) {
          int aDiff = Math.abs(a - 10);
          int bDiff = Math.abs(b - 10);

          if (aDiff < bDiff) {
            return a;
          }
          if (bDiff < aDiff) {
            return b;
          }
          return 0;  // i.e. aDiff == bDiff

      // Solution notes: aDiff/bDiff local vars clean the code up a bit.
      // Could have "else" before the second if and the return 0.
    }
*/

public int close10(int num_1, int num_2) {

    int closeTo10 = 0;

    if ((Math.abs(num_1 - 10)) == (Math.abs(num_2 - 10))){
        System.out.println(closeTo10);
        return closeTo10;
    } else {
        closeTo10 = (Math.abs(num_1 - 10)) < (Math.abs(num_2 - 10)) ? num_1 : num_2;

    }

    System.out.println(closeTo10);
    return closeTo10;
}
