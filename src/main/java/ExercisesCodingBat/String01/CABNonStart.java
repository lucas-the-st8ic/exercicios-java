void main(String[] args) {
    nonStart("Hello", "There"); //→ "ellohere"
    nonStart("java", "code"); //→ "avaode"
    nonStart("shotl", "java"); //→ "hotlava"
}

public String nonStart(String firstString, String secondString) {

    String result = firstString.substring(1)
            .concat(secondString.substring(1));
    return result;
}