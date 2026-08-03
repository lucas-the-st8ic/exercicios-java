void main(String[] args) {
    stringYak("pakyak"); //→ "pak"
    stringYak("yakpak"); //→ "pak"
    stringYak("yak123ya"); //→ "123ya"
}

public String stringYak(String string) {
    String result = "";
    for (int i = 0; i < string.length(); i++) {

        if (i + 2 < string.length() && string.charAt(i) == 'y'
                && string.charAt(i + 2) == 'k' )
        {   i += 2;

        } else {
            result += string.charAt(i);
        }
    }
    System.out.println(result);
    return result;
}