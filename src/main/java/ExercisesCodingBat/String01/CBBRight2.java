void main() {
    right2("Hello"); //"loHel"
    right2("java");  // "vaja"
    right2("Hi"); //"Hi"
}

/*
Given a string, return a "rotated right 2"
version where the last 2 chars are moved to the start.
The string length will be at least 2.

Dada uma string, retorne uma versão "rotacionada 2
posições para a direita", onde os dois últimos
caracteres são movidos para o início.
O comprimento da string deve ser de pelo menos
2 caracteres.
*/

public String right2(String string) {

    String result = string.substring(string.length() - 2)
            .concat(string.substring(0,string.length() - 2));

    System.out.println(result);
    return result;
}
