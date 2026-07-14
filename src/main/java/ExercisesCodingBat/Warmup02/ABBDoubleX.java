void main(String[] args) {
    doubleX("axxbb"); //→ true
    doubleX("axaxax"); // → false
    doubleX("xxxxx"); // → true
    doubleX("aaaax");
    doubleX("");
    doubleX("abc");
    doubleX("x");
}

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
