/*Given a string and a non-negative int n,
we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3.
Return n copies of the front;

Dada uma string e um inteiro não negativo n, consideramos
que o "início" da string são os 3 primeiros caracteres —
ou o que estiver disponível, caso a string tenha menos
de 3 caracteres. Retorne n cópias desse início;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
*/
void main(String[] args) {
    frontTimes("Chocolate", 2); //"ChoCho"
    frontTimes("Chocolate", 3); //"ChoChoCho"
    frontTimes("Abc", 3); //"AbcAbcAbc"
}

/*CodingBat solution:
    public String frontTimes(String str, int n) {
      int frontLen = 3;
      if (frontLen > str.length()) {
        frontLen = str.length();
      }
      String front = str.substring(0, frontLen);

      String result = "";
      for (int i=0; i<n; i++) {
        result = result + front;
      }
      return result;
    }
*/
public String frontTimes(String string, int number) {
    String finalString = "";
    if (string.length() <= 3) {
        for (int i = 0; i < number; i++) {
            finalString += string;
        }
        System.out.println(finalString);
        return finalString;
    }

    finalString = string.substring(0,3);
    for (int i = 1; i < number; i++) {
        finalString += string.substring(0,3);
    }
    System.out.println(finalString);
    return finalString;
}

