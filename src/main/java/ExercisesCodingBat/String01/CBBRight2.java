void main() {
    right2("Hello"); //"loHel"
    right2("java");  // "vaja"
    right2("Hi"); //"Hi"
}


public String right2(String string) {

    String result = string.substring(string.length() - 2)
            .concat(string.substring(0,string.length() - 2));

    System.out.println(result);
    return result;
}
