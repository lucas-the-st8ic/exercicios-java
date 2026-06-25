/* Return true if the given string
contains between 1 and 3 'e' chars.

Retorna verdadeiro se a string fornecida
contiver entre 1 e 3 caracteres 'e'.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false

*/

void main(String[] args) {
    stringE("Hello");
    stringE("Heelle");
    stringE("Heelele");
}
/* CodingBat solution:
    public boolean stringE(String str) {
      int count = 0;

      for (int i=0; i<str.length(); i++) {
        if (str.charAt(i) == 'e') count++;
        // alternately: str.substring(i, i+1).equals("e")
      }
      return (count >= 1 && count <= 3);
    }
*/

public boolean stringE(String string) {
    int eCharsQtd = 0;

    for (int i=0; i<string.length(); i++) {
        if (string.substring(i, i+1).equals("e")) {
            eCharsQtd++;
        }
    }

    return (eCharsQtd >= 1 && eCharsQtd <= 3);
}
