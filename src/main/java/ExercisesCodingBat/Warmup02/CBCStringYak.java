void main(String[] args) {
    stringYak("pakyak"); //→ "pak"
    stringYak("yakpak"); //→ "pak"
    stringYak("yak123ya"); //→ "123ya"
}

/*public String stringYak(String string) {
    String result = "";
    for (int i = 0; i < string.length(); i + 2) {
        if (string.matches(i, i+3) != "yak") {
            result += string.subSequence(i, i+3);
        }
    }
    System.out.println(result);
    return result;
}*/
