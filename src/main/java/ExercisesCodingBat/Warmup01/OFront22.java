/*

Given a string, take the first 2 chars and return the string with the
2 chars added at both the front and back, so "kitten" yields"kikittenki".
If the string length is less than 2, use whatever chars are there.

Dada uma string, pegue os 2 primeiros caracteres e retorne a string
com esses 2 caracteres adicionados no início e no fim, então "kitten"
resulta em "kikittenki". Se o comprimento da string for menor que 2, use
os caracteres restantes.

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
*/

void main(String[] args) {
    front22("Kitten");
    front22("Ha");
    front22("abc");
    front22("Hello");
}

/*
CodingBat solution:

public String front22(String str) {
  // First figure the number of chars to take
  int take = 2;
  if (take > str.length()) {
    take = str.length();
  }

  String front = str.substring(0, take);
  return front + str + front;
}
*/
public String front22(String string) {
    if (string.length() <= 2) {
        System.out.println(string + string + string);
        return string + string + string;
    }

    String first2Chars = string.substring(0, 2);

    System.out.println(first2Chars + string + first2Chars);

    return first2Chars + string + first2Chars;
}