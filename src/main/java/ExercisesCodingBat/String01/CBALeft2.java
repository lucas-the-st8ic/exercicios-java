void main() {
    left2("Hello"); //→ "lloHe"
    left2("java"); //→ "vaja"
    left2("Hi"); //→ "Hi"
}


public String left2(String string) {

    String result = string.substring(2)
            .concat(string.substring(0,2));

    return result;
}


