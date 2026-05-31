/*
Given an int n, return true if it is within 10 of 100 or 200.
Note: Math.abs(num) computes the absolute value of a number.

Dado um inteiro n, retorne verdadeiro se ele estiver a 10 de 100 ou 200.
Nota: Math.abs(num) calcula o valor absoluto de um número.

nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false*/

public boolean nearHundred(int n) {
    boolean result = false;

    if((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10 )) {
        result = true;
    }
    System.out.println(result);
    return result;
}


void main(String[] args) {
    nearHundred(190);
}
