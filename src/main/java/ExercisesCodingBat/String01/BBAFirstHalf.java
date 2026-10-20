void main(String[] args) {
    firstHalf("WooHoo"); //→ "Woo"
    firstHalf("HelloThere"); //→ "Hello"
    firstHalf("abcdef"); //→ "abc"
    firstHalf("abcdefg");
}
/*
Given a string of even length, return the first half.
So the string "WooHoo" yields "Woo".

Dada uma string de comprimento par, retorne a
primeira metade.
Assim, a string "WooHoo" resulta em "Woo".
*/

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

