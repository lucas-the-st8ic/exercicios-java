void main(String[] args) {
    startOz("ozymandias");
    startOz("bzoo");
    startOz("oxx");
    startOz("");
    startOz("o");
    startOz("z");
}

public String startOz(String string) {
    if (string.length() >= 2) {
        String firstChar = string.substring(0,1);
        String secondChar = string.substring(1,2);
        String newString = "";
        if(firstChar.equals("o")) {
            newString += "o";
            System.out.println(newString);
        }
        if (secondChar.equals("z")) {
            System.out.println(newString);
            newString += "z";
        }
        System.out.println(newString);
        return newString;
    } else {
        return string;
    }
}

/*Minha solução melhorada*/
public String startOzChatGpt(String string) {
    String newString = "";

    if (string.length() >= 1 &&
    string.substring(0,1).equals("o")) {
        newString += "o";
    }

    if (string.length() >= 2 &&
            string.substring(1,2).equals("z")) {
        newString += "z";
    }
    return newString
}
