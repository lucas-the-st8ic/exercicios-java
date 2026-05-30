
 public String missingChar(String string, int n) {
     char c = string.charAt(n);
     string = string.replace(c, ' ');
     System.out.println(string);
     return string;
 }


void main(String[] args) {
    missingChar("Kitten", 1);
}
