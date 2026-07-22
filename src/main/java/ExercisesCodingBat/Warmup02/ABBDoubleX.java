/* Given a string, return true if the first
instance of "x" in the string is
immediately followed by another "x".

Dada uma string, retorne verdadeiro se a
primeira ocorrência de "x" na string for
imediatamente seguida por outro "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
*/

void main(String[] args) {
    doubleX("axxbb"); //→ true
    doubleX("axaxax"); // → false
    doubleX("xxxxx"); // → true
    doubleX("aaaax");
    doubleX("");
    doubleX("abc");
    doubleX("x");
}
/*
* CodingBat Solution:
boolean doubleX(String str) {
  int i = str.indexOf("x");
  if (i == -1) return false; // no "x" at all

  // Is char at i+1 also an "x"?
  if (i+1 >= str.length()) return false; // check i+1 in bounds?
  return str.substring(i+1, i+2).equals("x");

  // Another approach -- .startsWith() simplifies the logic
  // String x = str.substring(i);
  // return x.startsWith("xx");
}*/
boolean doubleX(String string) {
    int indexX = string.indexOf('x');

    System.out.println("Posição do primeiro caractér \\x:" +indexX);
    int stringLength = string.length();
    System.out.println("Tamanho da String: " +stringLength);

    // Se não existir 'x', indexOf() retorna -1.
    if (indexX == -1) {
        return false;
    // Verifica se existem pelo menos dois caracteres
    // a partir do primeiro 'x', evitando
    // StringIndexOutOfBoundsException.
    } else if (indexX + 2 > stringLength) {
        return false;
    }
    else  {
        String doubleX = string.substring(indexX, indexX + 2);
        boolean isDoubleX = doubleX.equals("xx");
        System.out.println(isDoubleX);
        System.out.println("===================");
        return isDoubleX;
    }
}

boolean doubleX2(String string) {
    int indexX = string.indexOf('x');

    System.out.println("Posição do primeiro caractér \\x:" + indexX);
    System.out.println("Tamanho da String: " + string.length());

    // Se não existir 'x', indexOf() retorna -1.
    if (indexX == -1) return false;
    // Verifica se existe um caractere após o primeiro 'x',
    // evitando StringIndexOutOfBoundsException.
    if (indexX + 2 > string.length()) return false;

    return string.charAt(indexX + 1) == 'x';
}
