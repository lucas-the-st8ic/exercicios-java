/*Given an "out" string length 4, such as "<<>>",
and a word, return a new string where the word
is in the middle of the out string, e.g. "<<word>>".
Note: use str.substring(i, j) to extract
the String starting at index i and going up to but not including index j.

Dada uma string "out" de comprimento 4, como "<<>>",
e uma palavra, retorne uma nova string na qual a palavra
esteja no meio da string "out", por exemplo, "<<word>>".
Nota: use str.substring(i, j) para extrair
a String que começa no índice i e vai até o índice j, sem incluí-lo.

makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"*/

void main(String[] args) {
    makeOutWord("<<>>", "word");
    makeOutWord("<<>>", "Yay"); //→ "<<Yay>>"
    makeOutWord("<<>>", "WooHoo"); //→ "<<WooHoo>>"
    makeOutWord("[[]]", "word"); //→ "[[word]]"
}

public String makeOutWord(String out, String word) {
    String result = "";
    String beginString = out.substring(0, 2);
    String endString = out.substring(2 );

    result = beginString + word + endString;

    return result;
}
