void main(String[] args) {
    middleTwo("string"); //→ "ri"
    middleTwo("code"); //→ "od"
    middleTwo("Practice"); //→ "ct"
}

public String middleTwo(String string) {
    int initIndex = (string.length() / 2) - 1;
    int endIndex = initIndex + 2;
    String result = string.substring(initIndex, endIndex);

    System.out.println(result);
    return result;
}