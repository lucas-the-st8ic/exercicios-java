/*Given an array of ints, return true if the sequence
of numbers 1, 2, 3 appears in the array somewhere.

Dado um array de números inteiros, retorne verdadeiro
se a sequência de números 1, 2, 3 aparecer em algum lugar do array.

array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
*/

void main(String[] args) {
    array123(new int[]{1, 1, 2, 3, 1}); //→ true
    array123(new int[]{1, 1, 2, 4, 1}); //→ false
    array123(new int[]{1, 1, 2, 1, 2, 3}); //→ true
}

/*CodingBat Solution:
public boolean array123(int[] nums) {
  // Note: iterate < length-2, so can use i+1 and i+2 in the loop
  for (int i=0; i < (nums.length-2); i++) {
    if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
  }
  return false;
}*/
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