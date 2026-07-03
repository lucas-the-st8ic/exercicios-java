
void main(String[] args) {
    countXX("abcxx"); //→ 1
    countXX("xxx"); //→ 2
    countXX("xxxx"); //→ 3
}


/* Solução com Regex
    int countXX(String string) {
        Pattern pattern = Pattern.compile("(?=(xx))");
        Matcher matcher = pattern.matcher(string);

        int number = 0;
        while (matcher.find()) {
            number++;
        }
        System.out.println(number);
        return number;
    }
*/
