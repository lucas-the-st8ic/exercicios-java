/* Given a non-empty string and an int N, return the string made starting with char 0,
and then every Nth char of the string.
So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

Dada uma string não vazia e um inteiro N, retorne a string formada começando pelo caractere
de índice 0 e, em seguida, incluindo cada n-ésimo caractere da string.
Assim, se N for 3, utilize os caracteres nas posições 0, 3, 6, ...
e assim por diante. O valor de N é 1 ou maior.

everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
*/
void main(String[] args) {
    everyNth("Miracle", 2);
    everyNth("abcdefg", 2);
    everyNth("abcdefg", 3);
}
/*CodingBat Solution:

    public String everyNth(String str, int n) {
      String result = "";

      // Look at every nth char
      for (int i=0; i<str.length(); i = i + n) {
        result = result + str.charAt(i);
      }
      return result;
    }
*/
public String everyNth(String string, int number) {
    String finalString = "";
    for (int i = 0; i < string.length(); i += number) {
        char concat = string.charAt(i);
        finalString += concat;
        System.out.println(finalString);
    }
    return finalString;
}
