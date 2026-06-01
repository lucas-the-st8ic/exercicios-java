

void main(String[] args) {
    front22("Kitten");
    front22("Ha");
    front22("abc");
    front22("Hello");
}

public String front22(String string) {
    if (string.length() <= 2) {
        System.out.println(string + string + string);
        return string + string + string;
    }

    String first2Chars = string.substring(0, 2);

    System.out.println(first2Chars + string + first2Chars);

    return first2Chars + string + first2Chars;
}