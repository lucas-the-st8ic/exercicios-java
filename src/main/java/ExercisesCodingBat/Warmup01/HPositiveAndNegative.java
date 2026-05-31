/*
Given 2 int values, return true if one is negative
and one is positive.
Except if the parameter "negative" is true,
 then return true only if both are negative.

posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true

Dados dois valores inteiros,
retorne verdadeiro se um for negativo e o outro for positivo.
Exceto se o parâmetro "negativo" for verdadeiro,
nesse caso, retorne verdadeiro somente se ambos forem negativos.

CodingBat Solution:
public boolean posNeg(int a, int b, boolean negative) {
  if (negative) {
    return (a < 0 && b < 0);
  }
  else {
    return ((a < 0 && b > 0) || (a > 0 && b < 0));
  }
}
!!!ATENÇÃO!!!!!
Mais Simples
Verifica primeiro se o negativo é verdadeiro ou falso
e só depois verifica se ambos são negativos SE NÃO
verifica se um é positivo e o outro é negativo.
            !!!!!!ATENÇÃO!!!!!
*/

public boolean posNeg(int a, int b, boolean negative) {


    if (negative && (a < 0 && b < 0)) {
        return true;
    } else if (!negative && (
            (a < 0 && b > 0) || (a > 0 && b < 0) ) ) {
        return true;
    }

    return false;
}


void main(String[] args) {
    posNeg(1, -1, true);
}
