
/*Given 2 int values, return true if they are both in the range 30..40
inclusive, or they are both in the range 40..50 inclusive.


Dados dois valores inteiros, retorne verdadeiro se ambos estiverem no
intervalo de 30 num_140 (inclusive), ou se ambos estiverem no intervalo
de 40 num_150 (inclusive).

in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true

*/

void main(String[] args) {
    in3050(30, 31);
    in3050(30, 41);
    in3050(40, 50);
}

/*CodingBat solution:

    public boolean in3050(num_1, num_2) {
      if (num_1>= 30 && num_1<= 40 && num_2>= 30 && num_2<= 40) {
        return true;
      }
      if (num_1>= 40 && num_1<= 50 && num_2>= 40 && num_2<= 50) {
        return true;
      }
      return false;

      // This could be written as one very large expression,
      // connecting the two main parts with ||
      Example:
      public boolean in3050(num_1, num_2) {
      if ((num_1 >= 30 && num_1 <= 40 && num_2 >= 30 && num_2 <= 40) ||
        (num_1 >= 40 && num_1 <= 50 && num_2 >= 40 && num_2 <= 50)) {
        return true;
      }
        return false;
      }
*/

public boolean in3050(int num_1, int num_2) {
    if((num_1 >= 30 && num_1 <= 40) &&
            (num_2 >=30 && num_2 <= 40)) {
        return true;
    } else if ((num_1 >= 40 && num_1 <= 50) &&
            (num_2 >=40 && num_2 <= 50)) {
        return true;
    } else {
        return false;
    }
}
