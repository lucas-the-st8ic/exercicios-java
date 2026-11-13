/*
Given a string, return true if it ends in "ly".

Dada uma string, retorne true se o final terminar em "ly".
*/

void main(String[] args) {
    endsLy("oddly"); //→ true
    endsLy("y"); //→ false
    endsLy("oddy"); //→ false
}

public boolean endsLy(String string) {
    boolean result = false;

    if (string == null
            || string.length() < 2) return result;

    if (string.substring(string.length() - 2)
            .equals("ly")) {
        result = true;
    }

    return result;
}
