/*
Given a string, return true if "bad" appears
starting at index 0 or 1 in the string,
such as with "badxxx" or "xbadxx" but not
"xxbadxx". The string may be any length,
including 0.
Note: use .equals() to compare 2 strings.

Dada uma string, retorne `true` se "bad"
aparecer começando no índice 0 ou 1 da string
— como em "badxxx" ou "xbadxx", mas não em "xxbadxx".
A string pode ter qualquer comprimento, inclusive 0.
Observação: utilize `.equals()` para comparar
duas strings.
*/

void main(String[] args) {
    hasBad("badxx"); //→ true
    hasBad("xbadxx"); //→ true
    hasBad("xxbadxx"); //→ false
}

public boolean hasBad(String string) {

    if (string.length() < 3) {
        return false;
    }
    if (string.substring(0, 3).equals("bad")
            || string.length() >= 4
            && string.substring(1, 4).equals("bad")) {
        return true;
    }
    return false;
}


