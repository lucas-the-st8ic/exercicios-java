/* Given an array of ints, we'll say that
a triple is a value appearing 3 times in a
row in the array. Return true if the array
does not contain any triples.


Dado um array de números inteiros, definimos uma
"trinca" como um valor que aparece 3 vezes
consecutivas no array. Retorne verdadeiro se o
array não contiver nenhuma trinca.

noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false

*/

void main(String[] args) {
    noTriples(new int[]{1, 1, 2, 2, 1}); //→ true
    noTriples(new int[]{1, 1, 2, 2, 2, 1});//→ false
    noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}); //→ false
    noTriples(new int[]{1}); //→ false
}

public boolean noTriples(int[] numbers) {

    for (int i = 0; i < numbers.length - 2; i++) {
        int first = numbers[i];
        if (numbers[i + 1] == first &&
                numbers[i + 2] == first) {
            return false;
        }
    }
    return true;
}

/*
    public boolean noTriples(int[] numbers) {
        boolean result = true;
        //if (numbers.length <= 2) return result;
        for(int i = 0; i < numbers.length -2; i++){
            if (numbers[i + 1] == numbers[i] && numbers[i +2] == numbers[i]) {
                result = false;
                break;
            }
        }
        System.out.println(result);
        return result;
    }
*/
