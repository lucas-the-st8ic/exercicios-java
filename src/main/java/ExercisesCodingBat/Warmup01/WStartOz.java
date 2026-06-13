/*
Given a string, return a string made of the first 2 chars
(if present), however include first char only if it is 'o'
and include the second only if it is 'z',
so "ozymandias" yields "oz".

Dada uma string, retorne uma string composta pelos dois
primeiros caracteres (se presentes),
incluindo o primeiro caractere apenas se for 'o'
e o segundo apenas se for 'z', portanto "ozymandias"
retorna "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"*/

void main(String[] args) {

    startOz("ozymandias");
    startOz("bzoo");
    startOz("oxx");
    startOz("");
    startOz("o");
    startOz("z");
}

public String startOz(String string) {
    if (string.length() >= 2) {
        String firstChar = string.substring(0,1);
        String secondChar = string.substring(1,2);
        String newString = "";
        if(firstChar.equals("o")) {
            newString += "o";
            System.out.println(newString);
        }
        if (secondChar.equals("z")) {
            System.out.println(newString);
            newString += "z";
        }
        System.out.println(newString);
        return newString;
    } else {
        return string;
    }
}
/*CodingBat solution:

    public String startOz(String str) {
      String result = "";

      if (str.length() >= 1 && str.charAt(0)=='o') {
        result = result + str.charAt(0);
      }

      if (str.length() >= 2 && str.charAt(1)=='z') {
        result = result + str.charAt(1);
      }

      return result;
    }
*/


/*Minha solução melhorada pelo chat gpt
código mais simples e direto.*/

public String startOzChatGpt(String string) {
    String newString = "";

    if (string.length() >= 1 &&
    string.substring(0,1).equals("o")) {
        newString += "o";
    }

    if (string.length() >= 2 &&
            string.substring(1,2).equals("z")) {
        newString += "z";
    }
    return newString;
}
