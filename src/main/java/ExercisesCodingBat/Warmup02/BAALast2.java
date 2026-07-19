void main(String[] args) {
    last2("hixxhi");
    last2("");
}

public int last2(String string) {
    int count = 0;
    if (string.length() <= 3) {
        return count;
    }
    String last2Chars = string.substring(string.length() - 2);

    for (int i = 0; i < string.length() - 2; i++) {
        if (string.substring(i, i + 2).equals(last2Chars)) {
            System.out.println(string.substring(i, i + 2));
            count++;
        }
        System.out.println(count);
    }
    count = 0;
    return count;
}
