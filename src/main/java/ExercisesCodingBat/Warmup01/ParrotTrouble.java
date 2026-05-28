
/*
We have a loud talking parrot. The "hour" parameter is the current
hour time in the range 0..23. We are in trouble if the parrot
is talking and the hour is before 7 or after 20.
Return true if we are in trouble.

parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false

*/


public boolean parrotTrouble(boolean talking, int hour) {
    boolean trouble = false;

    if (talking && (hour < 7 || hour > 20)) {
        trouble = true;
    }
    System.out.println(trouble);
    return trouble;
}
/*
Temos um papagaio que fala alto. O parâmetro "hora" é a hora atual,
 no intervalo de 0 a 23. Estamos em apuros se o papagaio
estiver falando e a hora for antes das 7 ou depois das 20.
Retorne verdadeiro se estivermos em apuros.

CodingBat Solution:
        public boolean parrotTrouble(boolean talking, int hour) {
          return (talking && (hour < 7 || hour > 20));
          // Need extra parenthesis around the || clause
          // since && binds more tightly than ||
          // && is like arithmetic *, || is like arithmetic +
        }
*/

void main(String[] args) {
    parrotTrouble(true, 21);
}
