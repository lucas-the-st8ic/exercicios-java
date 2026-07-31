void main(String[] args) {
    noTriples(new int[]{1, 1, 2, 2, 1}); //→ true
    noTriples(new int[]{1, 1, 2, 2, 2, 1});//→ false
    noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}); //→ false
}

public boolean noTriples(int[] numbers) {
    boolean result = false;
    for(int i = 0; i < numbers.length -1; i++){
        if (numbers[i] == numbers[i + 1] && numbers[i] == numbers[i + 2]) {
            result = true;
            break;
        }
    }
    System.out.println(result);
    return result;
}
