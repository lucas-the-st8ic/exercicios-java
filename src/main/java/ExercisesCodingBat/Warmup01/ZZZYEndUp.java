/*
Given a string, return a new string where the last 3 chars are
now in upper case. If the string has less than 3 chars,
uppercase whatever is there. Note that str.toUpperCase()
returns the uppercase version of a string.

Dada uma string, retorne uma nova string na qual os últimos 3
caracteres estejam em letras maiúsculas. Se a string tiver menos de
3 caracteres, coloque em maiúsculas todos os caracteres
existentes. Lembre-se de que `str.toUpperCase()`
retorna a versão em letras maiúsculas de uma string.

endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
*/

void main(String[] args) {
    endUp("hi");
    endUp("lss");
    endUp("Hello");
    endUp("hi there");
}

/*CodingBat Solution:
    public String endUp(String str) {
      if (str.length() <= 3) return str.toUpperCase();
      int cut = str.length() - 3;
      String front = str.substring(0, cut);
      String back  = str.substring(cut);
      // this takes from cut to the end

      return front + back.toUpperCase();
    }
*/
public String endUp(String string) {
    if (string.length() <= 3) {
        System.out.println(string.toUpperCase());
        return string.toUpperCase();
    }

    String last3Chars = string.toUpperCase().substring(string.length() - 3);
    System.out.println(string.substring(0, string.length() - 3).concat(last3Chars));
    return string.substring(0, string.length() - 3).concat(last3Chars);
}
