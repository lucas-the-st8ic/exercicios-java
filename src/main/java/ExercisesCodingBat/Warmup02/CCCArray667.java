/*Given an array of ints, return the number of times
that two 6's are next to each other in the array.
Also count instances where the second "6" is actually a 7.

Dado um array de números inteiros, retorne o número de vezes
que dois números 6 aparecem lado a lado no array.
Conte também as ocorrências em que o segundo "6" é, na verdade, um 7.

array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1
*/

void main(String[] args) {
    array667(new int[]{6,6,2}); // → 1
    array667(new int[]{6,6,2,6}); // → 1
    array667(new int[]{6,7,2,6}); // → 1
}
public int array667(int[] numbers) {
    int count = 0;
    for (int i = 0; i < numbers.length - 1; i++) {
        if (numbers[i] == 6 && numbers[i + 1] == 6
                || numbers[i + 1] == 7) {
            count++;
        }
    }
    return count;
}

/*
public int array667(int[] nums) {
  int count = 0;
  // Note: iterate to length-1, so can use i+1 in the loop
  for (int i=0; i < (nums.length-1); i++) {
    if (nums[i] == 6) {
      if (nums[i+1] == 6 || nums[i+1] == 7) {
        count++;
      }
    }
  }
  return count;
}*/