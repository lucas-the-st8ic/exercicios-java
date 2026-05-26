public int diff21(int n) {
    int result;
    if(n <= 21){
        result = n - 21;
        result = Math.abs(result);
        System.out.println(result);
    } else {
        result = (n - 21) * 2;
        Math.abs(result);

        System.out.println(result);
    }
    return result;
}
/*
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.


Dado um inteiro n, retorne a diferença absoluta entre n e 21, exceto se n for maior que 21, caso em que retornará o dobro da diferença absoluta.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0*/

void main() {
    diff21(19);
    diff21(10);
    diff21(21);
}
