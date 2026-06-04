
/*
Given a string, return true if the string starts with "hi"
and false otherwise.

Dada uma string, retorne verdadeiro se a string começar
com "hi" e falso caso contrário.

startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false

*/

void main(String[] args) {
    startHi("Hi There");
    startHi("HiThere");
    startHi("Hello hi");
    startHi("Hi");
}
/* Codingbat Solution:

    public boolean startHi(String str) {
      // First test if the string is not at least length 2
      // (so the substring() below does not go past the end).
      if (str.length() < 2) return false;

      // Pull out the string of the first two chars
      String firstTwo = str.substring(0, 2);

      // Test if it is equal to "hi"
      if (firstTwo.equals("hi")) {
        return true;
      } else {
        return false;
      }
        // This last part can be shortened to:
        return(firstTwo.equals("hi"));
    }   */
public boolean startHi(String string) {
    if (string.length() <= 1) {
        return false;
    } else if(string.substring(0,2).trim().equalsIgnoreCase("Hi")) {
        System.out.println(string.substring(0,2).trim());
        return true;
    }

    return false;
}
