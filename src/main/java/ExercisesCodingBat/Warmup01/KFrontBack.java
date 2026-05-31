


void main(String[] args) {
    frontBack("a");
   frontBack("ab");
   frontBack("Paralelepipedo");
   frontBack("code");
}

public String frontBack(String string) {
    if (string.length() <= 1) {
        System.out.println(string);
        return string;
    } else {
        String beginString = string.substring(0, 1);
        String endString = string.substring(string.length() - 1);
        String midString = string.substring(1, string.length() - 1);
        System.out.println(beginString);
        System.out.println(midString);
        System.out.println(endString);
        string = endString + midString + beginString;
        System.out.println(string);
        return string;
    }
}
