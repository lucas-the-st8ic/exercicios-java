
/*Given a non-empty string and an int n, return a
new string where the char at index n has been removed.
The value of n will be a valid index of a char in the
 original string
 (i.e. n will be in the range 0..str.length()-1 inclusive)

Dada uma string não vazia e um inteiro n, retorne uma
nova string onde o caractere no índice n foi removido.
O valor de n será um índice válido de um caractere na
string original (ou seja, n estará no intervalo
de 0 a str.length()-1, inclusive).
 .*/
/*
A substring é exclusiva ou seja de 0 a 1 ele irá pegar
apenas o caractere no indice 0, 0 a 2 irá pegar os
caracteres nos indices 0 e 1
Quando você faz: - string.substring(0, n) - você pega
tudo antes do índice n.
   E quando faz: string.substring(n + 1)
    você pega tudo depois do índice n.
*/
 public String missingChar(String string, int n) {

         System.out.println(string.substring(n));

         String stringBegin = string.substring(0,n);
         System.out.println(stringBegin);

         String stringFinal = string.substring(n + 1);
         System.out.println(stringFinal);

         System.out.println(stringBegin.concat(
                 stringFinal
         ));

         return stringBegin.concat(stringFinal);
 }


/*
CodingBat Solution:
    public String missingChar(String str, int n) {
        String front = str.substring(0, n);

        String back = str.substring(n+1, str.length());

        return front + back;
    }
    Start this substring at n+1 to omit the char.
    Can also be shortened to just str.substring(n+1)
    which goes through the end of the string.
    -----------------------------------------
    Comece esta substring em n+1 para omitir o caractere.
    Também pode ser abreviado para apenas str.substring(n+1)
    que percorre o final da string.
  */

void main(String[] args) {

    missingChar("Kitten", 0);
}
