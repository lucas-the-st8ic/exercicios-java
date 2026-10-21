void main(String[] args) {
    theEnd("Hello", true); // → "H"
    theEnd("Hello", false); // → "o"
    theEnd("oh", true); // → "o"
}

/*
Given a string, return a string length 1 from its
front, unless front is false, in which case return a
string length 1 from its back.
The string will be non-empty.

Dada uma string, retorne uma string de comprimento 1
a partir do seu início; caso o parâmetro indicativo
de início seja falso, retorne uma string de comprimento
1 a partir do seu final. A string não estará vazia.
*/

public String theEnd(String string, boolean front) {

    if(front) {
        System.out.println(string.substring(0, 1));
        return string.substring(0,1);
    } else {
        System.out.println(string.substring(string.length() - 1));
        return string.substring(string.length() - 1);
    }
}
