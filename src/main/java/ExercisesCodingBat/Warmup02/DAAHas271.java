void main(String[] args) {
    has271(new int[]{1, 2, 7, 1});  // → true
    has271(new int[]{1, 2, 8, 1});  // → false
    has271(new int[]{2, 7, 1});  //→ true
}

public boolean has271(int[] numbers) {
    for (int i = 0; i < numbers.length - 2; i++) {
        if (numbers[i + 1] == numbers[i] + 5
        && Math.abs(numbers[i + 2] - numbers[i - 1]) <= 2) {
            return true;
        }
    }
    return false;
}
/*
X
X + 5
X - 1
*/