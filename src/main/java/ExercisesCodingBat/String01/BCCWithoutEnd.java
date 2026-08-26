/*Given a string, return a version without the first and
last char, so "Hello" yields "ell".
The string length will be at least 2.

Dada uma string, retorne uma versão sem o primeiro e o
último caractere; assim, "Hello" resulta em "ell".
O comprimento da string será de pelo menos 2.

withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"*/

void main(String[] args) {
    withoutEnd("Hello"); //→ "ell"
    withoutEnd("java"); //→ "av"
    withoutEnd("coding"); //→ "odin"
}

public String withoutEnd(String string) {
    String result = "";

    result = string.substring(1, string.length() - 1);

    System.out.println(result);
    return result;
}
