void main(String[] args) {
    comboString("Hello", "hi"); //→ "hiHellohi"
    comboString("hi", "Hello"); //→ "hiHellohi"
    comboString("aaa", "b"); //→ "baaab"
}

private String comboString(String firstString,
                           String secondString) {
    String result = "";

    if (firstString.length() < secondString.length()) {
        result = firstString +
                secondString + firstString;
        return result;
    }
    if (secondString.length() < firstString.length()) {
        result = secondString +
                firstString + secondString;
        return result;
    } else {
        result = firstString + secondString;
        return result;
    }
}

