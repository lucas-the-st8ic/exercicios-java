void main(String[] args) {
   stringBits("Hello");
   stringBits("Hi");
   stringBits("Heeololeo");
}

public String stringBits(String string) {
    String result = "";
    for (int i = 0; i < string.length(); i+= 2) {
        char caracter =  string.charAt(i);
        result += caracter;
    }
    System.out.println(result);
    return result;
}
