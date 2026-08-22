/*Given a string, return a new string made
of 3 copies of the last 2 chars of the original string.
The string length will be at least 2.

Dada uma string, retorne uma nova string composta por:
3 cópias dos 2 últimos caracteres da string original.
O comprimento da string será de pelo menos 2 caracteres.

extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"*/

void main(String[] args) {

}

public String extreEnd(String string) {
    String end = string.substring(string.length() - 2);

    System.out.println(string);
    System.out.println(end);

    return end;
}
