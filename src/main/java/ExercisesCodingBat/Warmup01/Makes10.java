/*
Given 2 ints, a and b, return true if one if them is
 10 or if their sum is 10.

Dados dois inteiros, a e b, retorne verdadeiro se um deles for 10
ou se a soma deles for 10.

makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true

CodingBat Solution:
    public boolean makes10(int a, int b) {
           return (a == 10 || b == 10 || a+b == 10);
    }
        */

public boolean makes10(int a, int b) {
    boolean result = false;

    if ((a == 10 || b == 10) || (a + b == 10)) {
        result = true;
    }
    System.out.println(result);
    return result;
}

void main(String[] args) {
     makes10(4, 6);
}
