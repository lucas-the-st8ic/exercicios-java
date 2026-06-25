void main(String[] args) {
    endUp("hi");
    endUp("lss");
    endUp("Hello");
    endUp("hi there");
}

public String endUp(String string) {
    if (string.length() <= 3) {
        System.out.println(string.toUpperCase());
        return string.toUpperCase();
    }

    String last3Chars = string.toUpperCase().substring(string.length() - 3);
    System.out.println(string.substring(0, string.length() - 3).concat(last3Chars));
    return string.substring(0, string.length() - 3).concat(last3Chars);
}
