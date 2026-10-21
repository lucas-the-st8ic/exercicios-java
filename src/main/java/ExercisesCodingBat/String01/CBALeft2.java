void main() {
    left2("Hello"); //→ "lloHe"
    left2("java"); //→ "vaja"
    left2("Hi"); //→ "Hi"
}
/*Given a string, return a "rotated left 2"
version where the first 2 chars are moved to the end.
The string length will be at least 2.

Dada uma string, retorne uma versão "rotacionada 2
para a esquerda", onde os dois primeiros
caracteres são movidos para o final.
O comprimento da string deve ser de pelo menos
2 caracteres.
*/

public String left2(String string) {

    String result = string.substring(2)
            .concat(string.substring(0,2));

    return result;
}


