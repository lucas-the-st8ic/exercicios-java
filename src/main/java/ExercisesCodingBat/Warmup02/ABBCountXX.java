
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

int countXX(String string) {
    int count = 0;
    
    for(int i = 0; i < string.length()-1; i++) {
        if(string.charAt(i) == 'x' && string.charAt(i+1) == 'x'){
            count++;
            System.out.println("Contador de xx:"+ count);
            System.out.println("=====");
        }
    }
    System.out.println(count);
    System.out.println("======");
    return count;

}