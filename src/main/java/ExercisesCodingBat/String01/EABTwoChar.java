/*
Given a string and an index, return a string length 2
starting at the given index. If the index is
too big or too small to define a string length 2,
use the first 2 chars. The string length will be
at least 2.

Dada uma string e um índice, retorne uma string
de comprimento 2 começando no índice fornecido.
Se o índice for grande ou pequeno demais para
definir uma string de comprimento 2,
utilize os dois primeiros caracteres.
A string terá, no mínimo, 2 caracteres de comprimento.
*/
void main(String[] args) {
    twoChar("java", 0); //→ "ja"
    twoChar("java", 2); //→ "va"
    twoChar("java", 3); //→ "ja"

}

public String twoChar(String string, int index) {
    String result;

    if (index < 0
            || index >= string.length() - 1) {
        result = string.substring(0,2);
        System.out.println(result);
    } else  {
        result = string.substring(index, index + 2);
        System.out.println(result);
    }

    return result;
}

