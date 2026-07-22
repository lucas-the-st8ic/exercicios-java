/*Given a string, return the count of
the number of times that a substring
length 2 appears in the string and
also as the last 2 chars of the string,
so "hixxxhi"
yields 1 (we won't count the end substring).

Dada uma string, retorne a contagem de
quantas vezes uma substring de comprimento 2
aparece na string e também corresponde aos
dois últimos caracteres da string; assim,
"hixxxhi" resulta em 1
(não contaremos a substring do final).

last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
*/

void main(String[] args) {
    last2("hixxhi");
    last2("");
}

/*
CodingBat Solution:

public int last2(String str) {
  // Screen out too-short string case.
  if (str.length() < 2) return 0;

  String end = str.substring(str.length()-2);
  // Note: substring() with 1 value goes through the end of the string
  int count = 0;

  // Check each substring length 2 starting at i
  for (int i=0; i<str.length()-2; i++) {
    String sub = str.substring(i, i+2);
    if (sub.equals(end)) {  // Use .equals() with strings
      count++;
    }
  }

  return count;
}*/

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
