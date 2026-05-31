
/*
Given a string, return a new string where "not " has been added
to the front. However, if the string already begins with "not",
return the string unchanged. Note: use .equals() to compare 2 strings.

Dada uma string, retorne uma nova string onde "not" foi adicionado
ao início. No entanto, se a string já começar com "not", retorne
a string sem alterações. Observação: use .equals() para comparar
duas strings.

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"*/

public String notString(String string)  {
   if(string.length() >= 3 &&
           string.substring(0,3).equalsIgnoreCase("not")) {
       System.out.println(string);
       return string;
   } else {
       string = ("not ".concat(string));
       System.out.println(string);
       return string;
   }
}
/*
CodingBat solution:
    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
        return str;
    }

    return "not " + str;
}*/


void  main(String[] args) {
    notString("no");
}

