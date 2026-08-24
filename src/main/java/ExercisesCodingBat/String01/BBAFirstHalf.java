void main(String[] args) {
    firstHalf("WooHoo"); //→ "Woo"
    firstHalf("HelloThere"); //→ "Hello"
    firstHalf("abcdef"); //→ "abc"
    firstHalf("abcdefg");
}


public String firstHalf(String string) {
    String result = "";
    if (string.length() % 2 == 0) {
        result = string.substring(0, string.length() / 2);
        System.out.println(result);
        return result;
    } else {
        result = "String length must be even.";
        System.out.println(result);
        return result;
    }


}
