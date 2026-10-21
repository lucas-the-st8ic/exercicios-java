void main(String[] args) {
    withouEnd2("Hello"); // → "ell"
    withouEnd2("abc"); // → "b"
    withouEnd2("ab"); // → ""
}

public String withouEnd2(String string) {
        if (string.length() <= 2) {
            String result = "";
            System.out.println(result);
            return result;
        }
        else {
            String result = string.substring(1,string.length() - 1);
            System.out.println(result);
            return result;
        }

}