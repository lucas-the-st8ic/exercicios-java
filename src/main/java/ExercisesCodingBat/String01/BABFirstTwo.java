/*
Given a string, return the string made of its
first two chars, so the String "Hello" yields "He".
If the string is shorter than length 2,
return whatever there is, so "X" yields "X",
and the empty string "" yields the empty string "".
Note that str.length() returns the length of a string.

Dada uma string, retorne a string composta pelos seus
dois primeiros caracteres; assim, a string "Hello"
resulta em "He". Se a string tiver menos de 2 caracteres,
retorne o que estiver disponível; assim, "X"
resulta em "X", e a string vazia "" resulta na
string vazia "".
Observe que str.length() retorna o comprimento de
uma string.

*/

void main(String[] args) {
    firstTwo("Hello"); //→ "He"
    firstTwo("abcdefg"); //→ "ab"
    firstTwo("ab"); //→ "ab"
}

public String firstTwo(String string) {

    if (string.length() < 2) return string;

    String begin = string.substring(0,2);

    return begin;
}
