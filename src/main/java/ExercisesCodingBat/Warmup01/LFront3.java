

/*
Given a string, we'll say that the front is the first 3
chars of the string. If the string length is less than 3,
the front is whatever is there. Return a new string which
is 3 copies of the front.

Dada uma string, diremos que a frente são os 3 primeiros
caracteres da string. Se o comprimento da string for menor
que 3, a frente será o que estiver presente. Retorne uma
nova string que seja 3 cópias da frente.

front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
*/


void main(String[] args) {
    front3("Chocolate");
    front3("Java");
    front3("Cd");
}

public String front3(String string) {
    if (string.length() <= 3) {
        System.out.println(string + string + string);
        return string + string + string;
    }

    String first3Chars = string.substring(0,3);
    String newString = first3Chars +first3Chars + first3Chars;
    System.out.println(newString);
    return newString;
}

/*
CodingBat solution:
    public String front3(String str) {
      String front;

      if (str.length() >= 3) {
        front = str.substring(0, 3);
      }
      else {
        front = str;
      }

      return front + front + front;
    }


*/
