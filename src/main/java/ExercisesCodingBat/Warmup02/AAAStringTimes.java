/*Given a string and a non-negative int n, return a larger string
that is n copies of the original string.

Dada uma string e um inteiro não negativo n, retorne uma string
maior que seja n cópias da string original.

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"

*/
void main(String[] args) {
    stringTimes("Hi", 2);/* → "HiHi"*/
    stringTimes("Hi", 3);/* → "HiHiHi"*/
    stringTimes("Hi", 1);/* → "Hi"*/
}
/*
Codingbat Solution:
    public String stringTimes(String str, int n) {
      String result = "";
      for (int i=0; i<n; i++) {
        result = result + str;  // could use += here
      }
      return result;
    }
*/
public String stringTimes(String string, int number) {
    if (number == 1) {
        return string;
    }
    String newString = "";
    for(int i = 0; i < number; i++) {
        newString += string;
        System.out.println(newString);
    }
    return  newString;

}
