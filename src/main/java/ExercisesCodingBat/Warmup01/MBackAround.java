
/*

Given a string, take the last char and return a new string with the last
char added at the front and back, so "cat" yields "tcatt".
The original string will be length 1 or more.

Dada uma string, pegue o último caractere e retorne uma nova string com
o último caractere adicionado no início e no fim, de forma que "cat"
resulte em "tcatt". A string original terá comprimento 1 ou mais.


backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"

*/

void main(String[] args) {
    backAround("cat");
    backAround("Hello");
    backAround("Hi");
    backAround("boo");
}

/*
CodingBat solution:

public String backAround(String str) {
  // Get the last char
  String last = str.substring(str.length() - 1);
  return last + str + last;
}

*/

public String backAround(String string) {
    if (string.length() <= 1) {
        System.out.println(string + string + string);
        return string + string + string;
    }

    System.out.println(string.substring(string.length()-1) + string +
            string.substring(string.length()-1));

    return string.substring(string.length()-1) + string + string.substring(string.length()-1);
}
