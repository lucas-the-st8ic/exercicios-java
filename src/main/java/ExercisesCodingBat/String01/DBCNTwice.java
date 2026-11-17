


void main(String[] args) {
    nTwice("Hello", 2); //→ "Helo"
    nTwice("Chocolate", 3); //→ "Choate"
    nTwice("Chocolate", 1); //→ "Ce"

}


public String nTwice(String string, int number) {

    System.out.println(string.substring(0,number));
    System.out.println(string.substring(string.length() - number));

    String result = string.substring(0,number) + string.substring(string.length() - number);

    return result;
}

