/*
Given a string and an int n, return a string made of
the first and last n chars from the string.
The string length will be at least n.

Dada uma string e um número inteiro n, retorne uma string
composta pelos primeiros e pelos últimos n caracteres da
string original. O comprimento da string será de, pelo menos, n.
*/

void main(String[] args) {
    nTwice("Hello", 2); //→ "Helo"
    nTwice("Chocolate", 3); //→ "Choate"
    nTwice("Chocolate", 1); //→ "Ce"

}


public String nTwice(String string, int number) {

    System.out.print(string.substring(0,number));
    System.out.println(string.substring(string.length() - number));

    String result = string.substring(0,number) + string.substring(string.length() - number);

    return result;
}

