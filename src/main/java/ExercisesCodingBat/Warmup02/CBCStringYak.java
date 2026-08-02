void main(String[] args) {
    stringYak("pakyak"); //→ "pak"
    stringYak("yakpak"); //→ "pak"
    stringYak("yak123ya"); //→ "123ya"
}

public String stringYak(String string) {
    String result = "";

    System.out.println(string.length() - 2);
    for (int i = 0; i < string.length() - 2; i++) {
        System.out.println("Índice: " + i);
        System.out.println("================");
        System.out.println(string.length() - 2);
        if (string.charAt(i) != 'y' && string.charAt(i + 2) != 'z') {
            System.out.println("String do índice i: " + string.charAt(i));
            System.out.println("String do índice i + 2: " + string.charAt(i + 2));
            System.out.println("================");
            result += string.substring(i, i + 3);
            System.out.println(result);
            System.out.println("================");
            if (i + 2 < string.length()) {
                i += 2;
            }
        }
    }

    System.out.println(result);
    return result;
}