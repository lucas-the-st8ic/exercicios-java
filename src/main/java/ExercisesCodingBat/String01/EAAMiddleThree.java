

void main(String[] args) {
    middleThree("Candy"); //→ "and"
    middleThree("and"); //→ "and"
    middleThree("solving"); //→ "lvi"
}

public String middleThree(String string) {

    String result;

    if (string.length() == 3) {
        return string;
    } else {
        result = string.substring((string.length() / 2) - 1,
                (string.length() / 2) + 2);

    }
    System.out.println(result);
    return result;
}

