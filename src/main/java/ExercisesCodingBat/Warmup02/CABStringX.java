/*Given a string, return a version where
all the "x" have been removed.
Except an "x" at the very start or
end should not be removed.

Dada uma string, retorne uma versão na qual todos os
caracteres "x" tenham sido removidos.
No entanto, um "x" situado exatamente no início ou
no final não deve ser removido.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"

*/

void main(String[] args) {
    stringX("xxHxix"); //→ "xHix"
    stringX("abxxxcd"); //→ "abcd"
    stringX("xabxxxcdx"); //→ "xabcdx"
}

public String stringX (String string) {
    String result = "";

    for (int i = 0; i < string.length(); i++) {
        if (string.charAt(i) == 'x' && i != 0
        && i != string.length() -1 ) {
            //Ignora
        } else {
            result += string.charAt(i);
        }
    }
    System.out.println(result);
    return result;
}
/*
CodingBat Solution:
    public String stringX(String str) {
      String result = "";
      for (int i=0; i<str.length(); i++) {
        // Only append the char if it is not the "x" case
        if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
          result = result + str.substring(i, i+1); // Could use str.charAt(i) here
        }
      }
      return result;
    }                   */