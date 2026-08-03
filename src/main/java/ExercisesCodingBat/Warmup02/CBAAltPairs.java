/*Given a string, return a string made of
the chars at indexes 0,1, 4,5, 8,9 ... so
"kittens" yields "kien".

Dada uma string, retorne uma string composta
pelos caracteres nos índices 0, 1, 4, 5, 8, 9...
assim, "kittens" resulta em "kien".

altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
 */
void main(String[] args) {
    altPairs("kitten"); //→ "kien"
    altPairs("Chocolate"); //→ "Chole"
    altPairs("CodingHorror"); //→ "Congrr"
    altPairs2("kitten"); //→ "kien"
    altPairs2("Chocolate"); //→ "Chole"
    altPairs2("CodingHorror"); //→ "Congrr"
}

public String altPairs(String string) {
    String newString = "";

    for (int i = 0; i < string.length(); i++) {
        if (i % 4 == 0 || i % 4 == 1) {
            newString += string.charAt(i);
        }
    }
    System.out.printf(newString);
    return newString;
}

/*CodingBat Solution:
Pega dois caractéres por vez com o substring
public String altPairs(String str) {
  String result = "";

  // Run i by 4 to hit 0, 4, 8, ...
  for (int i=0; i<str.length(); i += 4) {
    // Append the chars between i and i+2
    int end = i + 2;
    if (end > str.length()) {
      end = str.length();
    }
    result = result + str.substring(i, end);
  }

  return result;
}*/
public String altPairs2(String string) {

    String newString = "";
    for (int i = 0; i < string.length(); ) {
        newString += string.charAt(i);
        i += (i % 2 == 0) ? 1 : 3;
    }
    System.out.printf(newString);
    return newString;
}

