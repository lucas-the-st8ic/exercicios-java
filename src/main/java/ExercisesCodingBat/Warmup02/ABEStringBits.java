/*Given a string, return a new string made of
every other char starting with the first,
so "Hello" yields "Hlo".

Dada uma string, retorne uma nova string
composta por caracteres alternados,
começando pelo primeiro; assim,
"Hello" resulta em "Hlo".

stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"

*/

void main(String[] args) {
   stringBits("Hello");
   stringBits("Hi");
   stringBits("Heeololeo");
}

/*CodingBat Solution:

public String stringBits(String str) {
  String result = "";
  // Note: the loop increments i by 2
  for (int i=0; i<str.length(); i+=2) {
    result = result + str.substring(i, i+1);
    // Alternately could use str.charAt(i)
  }
  return result;
}*/
public String stringBits(String string) {
    String result = "";
    for (int i = 0; i < string.length(); i+= 2) {
        char caracter =  string.charAt(i);
        result += caracter;
    }
    System.out.println(result);
    return result;
}
