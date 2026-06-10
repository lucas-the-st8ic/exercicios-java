/*

Given a string, if the string "del" appears starting at
index 1, return a string where that "del" has been
deleted. Otherwise, return the string unchanged.

Dada uma string, se a string "del" aparecer a
partir do índice 1, retorne uma string onde esse "del"
foi removido.
Caso contrário, retorne a string sem alterações.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
*/

void main(String[] args) {
   delDel("adelbc");
   delDel("adelHello");
   delDel("adedbc");

}
/* CodingBat Solution:
//Solução do coding bat juntou as duas condições
no primeiro if deixando mais organizado legível e coeso.

    public String delDel(String str) {
      if (str.length()>=4 && str.substring(1, 4).equals("del")) {
        // First char + rest of string starting at 4
        return str.substring(0, 1) + str.substring(4);
      }
      // Otherwise return the original string.
      return str;
    }
*/
public String delDel(String string) {
    if (string.length() <= 3) {
        System.out.println(string);
        return string;
    }else if (string.substring(1,4)
            .equalsIgnoreCase("del")) {
        String newString = string.substring(0,1) + string.substring(4);
        System.out.println(newString);
        return newString;
    } else {
        System.out.println(string);
        return string;
    }
}