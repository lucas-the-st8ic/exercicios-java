void main(String[] args) {
    comboString("Hello", "hi"); //→ "hiHellohi"
    comboString("hi", "Hello"); //→ "hiHellohi"
    comboString("aaa", "b"); //→ "baaab"
}
/*
Given 2 strings, a and b, return a string of the form
short+long+short, with the shorter string on
the outside and the longer string on the inside.
The strings will not be the same length, but they may
be empty (length 0).

Dadas duas strings, a e b, retorne uma string
no formato curta+longa+curta, com a string mais curta
nas extremidades e a string mais longa no meio.
As strings não terão o mesmo comprimento,
mas podem estar vazias (comprimento 0).

*/
private String comboString(String firstString,
                           String secondString) {

    if (firstString.length() < secondString.length()) {
        return firstString +
                secondString + firstString;
    }
    if (secondString.length() < firstString.length()) {
        return secondString +
                firstString + secondString;

    }

    return firstString + secondString;

}

