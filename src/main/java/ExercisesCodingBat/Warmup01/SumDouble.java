

/*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.

 Dados dois valores inteiros, retorne a soma deles. A menos que os dois valores sejam iguais, retorne o dobro da soma.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8


*/

public int sumDouble(int a, int b) {
    int sum;
    if (a == b){
        a += a;
        b += b;

    }
    sum = a + b;
    System.out.println(sum);
    return sum;
}
/* CodingBat Solution:

public int sumDouble(int a, int b) {
  // Store the sum in a local variable
  int sum = a + b;

  // Double it if a and b are the same
  if (a == b) {
    sum = sum * 2;
  }

  return sum;
}*/
void main() {
    sumDouble(2,3);
}
