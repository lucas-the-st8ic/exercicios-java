/* Given 2 strings, a and b, return
the number of the positions where
they contain the same length 2 substring.
So "xxcaazz" and "xxbaaz" yields 3,
since the "xx", "aa", and "az"
substrings appear in the same place in both strings.

Dadas duas strings, a e b, retorne o número de
posições em que elas contêm a mesma substring
de comprimento 2.
Assim, "xxcaazz" e "xxbaaz" resultam em 3,
uma vez que as substrings "xx", "aa" e "az"
aparecem na mesma posição em ambas as strings.

stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0   */

void main(String[] args) {
    stringMatch("xxcaazz", "xxbaaz"); //→ 3
    stringMatch("abc", "abc"); //→ 2
    stringMatch("abc", "axc"); //→ 0
}

public int stringMatch(String a, String b) {
    int count = 0;
    int minLength = Math.min(a.length(), b.length());
    for (int i = 0; i < minLength - 1; i++) {
        if ((a.charAt(i) == b.charAt(i)) &&
                (a.charAt(i + 1) == b.charAt(i +1)))
        {
            count++;
        }
    }
    System.out.println(count);
    return count;
}