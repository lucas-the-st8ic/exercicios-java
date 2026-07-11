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
    String doubleX = string.substring(string.indexOf('x'), string.indexOf('x') + 2);
    boolean isDoubleX = doubleX.equals("xx");
    System.out.println(isDoubleX);
    return isDoubleX;
}
