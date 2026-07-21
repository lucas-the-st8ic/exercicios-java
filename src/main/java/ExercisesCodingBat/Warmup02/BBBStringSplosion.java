/*Given a non-empty string like "Code" return a string
like "CCoCodCode".

stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
*/

void main(String[] args) {
    stringSplosion("Code");
    stringSplosion("Abc");
    stringSplosion("Ab");
    stringSplosion("Python");

}

public String stringSplosion(String string) {
    String newString = "";
        for (int i = 0; i < string.length(); i++) {
            newString += string.substring(0, i + 1);
        }
    return newString;
}

/*
Codingbat Solution:

public String stringSplosion(String str) {
  String result = "";
  // On each iteration, add the substring of the chars 0..i
  for (int i=0; i<str.length(); i++) {
    result = result + str.substring(0, i+1);
  }
  return result;
}
*/
