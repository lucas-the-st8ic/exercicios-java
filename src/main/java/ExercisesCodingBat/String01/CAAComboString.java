void main(String[] args) {
    comboString("Hello", "hi"); //→ "hiHellohi"
    comboString("hi", "Hello"); //→ "hiHellohi"
    comboString("aaa", "b"); //→ "baaab"
}

private String comboString(String firstString,
                           String secondString) {

    if (firstString.length() < secondString.length()) {
        return firstString +
                secondString + firstString;
    }
    if (secondString.length() < firstString.length()) {
        return secondString +
                firstString + secondString;

    }

    return firstString + secondString;

}

