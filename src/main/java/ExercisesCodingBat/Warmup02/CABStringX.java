void main(String[] args) {
    stringX("xxHxix"); //→ "xHix"
    stringX("abxxxcd"); //→ "abcd"
    stringX("xabxxxcdx"); //→ "xabcdx"
}

public String stringX (String string) {
    String result = "";

    for (int i = 0; i < string.length(); i++) {
        if (string.charAt(i) == 'x' && i != 0
        && i != string.length() -1 ) {
            //Ignora
        } else {
            result += string.charAt(i);
        }
    }
    System.out.println(result);
    return result;
}
