

void main(String[] args) {
    backAround("cat");
    backAround("Hello");
}

public String backAround(String string) {
    if (string.length() <= 1) {
        System.out.println(string + string + string);
        return string + string + string;
    }

    System.out.println(string.substring(string.length()-1) + string +
            string.substring(string.length()-1));

    return string.substring(string.length()-1) + string + string.substring(string.length()-1);
}
