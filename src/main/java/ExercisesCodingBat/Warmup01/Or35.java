/*
Return true if the given non-negative number is a multiple of 3 or a
multiple of 5. Use the % "mod" operator -- see Introduction to Mod

Retorna verdadeiro se o número não negativo fornecido for múltiplo de 3
ou múltiplo de 5. Use o operador % "mod" -- veja Introdução ao operador
Mod.


or35(3) → true
or35(10) → true
or35(8) → false
*/


void main(String[] args) {
    or35(3);
    or35(10);
    or35(8);
}


//My Solutions:
public boolean or35(int n) {
    return n % 3 == 0 || n % 5 == 0 ? true : false;
}
/*
public boolean or35(int n) {
    if(n % 3 == 0 || n % 5 == 0) {
        System.out.println(true);
        return true;
    }

    System.out.println(false);
    return false;
}*/
