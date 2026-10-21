void main(String[] args) {
    nonStart("Hello", "There"); //→ "ellohere"
    nonStart("java", "code"); //→ "avaode"
    nonStart("shotl", "java"); //→ "hotlava"
}
/*
Given 2 strings, return their concatenation,
except omit the first char of each.
The strings will be at least length 1.

Dadas duas strings, retorne a concatenação delas,
omitindo o primeiro caractere de cada uma.
As strings devem ter pelo menos
um caractere de comprimento.
*/
public String nonStart(String firstString, String secondString) {

    String result = firstString.substring(1)
            .concat(secondString.substring(1));
    return result;
}