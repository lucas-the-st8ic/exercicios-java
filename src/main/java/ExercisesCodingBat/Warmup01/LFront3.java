


void main(String[] args) {
    front3("Chocolate");
    front3("Java");
    front3("Cd");
}

public String front3(String string) {
    if (string.length() <= 3) {
        System.out.println(string.concat(string+string));
        return string.concat(string+string);
    }

    String first3Chars = string.substring(0,3);
    String newString = first3Chars.concat(first3Chars + first3Chars);
    System.out.println(newString);
    return newString;
}
