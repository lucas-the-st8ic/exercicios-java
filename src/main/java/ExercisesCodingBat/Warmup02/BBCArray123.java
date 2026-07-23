void main(String[] args) {
    array123(new int[]{1, 1, 2, 3, 1}); //→ true
    array123(new int[]{1, 1, 2, 4, 1}); //→ false
    array123(new int[]{1, 1, 2, 1, 2, 3}); //→ true
}

public boolean array123(int[] numbers) {
    boolean result = false;
    for(int i = 0; i < numbers.length - 2; i++){
        if (numbers[i] == 1 && numbers[i + 1] == 2 &&
        numbers[i + 2] == 3) {
            result = true;
            break;
        }
    }
    System.out.println(result);
    return result;
}