/*Given an array of ints, return the number of
9's in the array.

Dado um array de números inteiros, retorne a
quantidade de números 9 presentes no array.

arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3

*/

void main(String[] args) {
    arrayCount9(new int[] {1, 2, 9}); // → 1
    arrayCount9(new int[] {1, 9, 9}); //  → 2
    arrayCount9(new int[] {1, 9, 9, 3, 9}); //  → 3
}

/*CodingBat Solution:
public int arrayCount9(int[] nums) {
  int count = 0;
  for (int i=0; i<nums.length; i++) {
    if (nums[i] == 9) {
      count++;
    }
  }
  return count;
}*/

public int arrayCount9(int[] nums) {
    int count = 0;
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] == 9) {
            count++;
        }
    }
    System.out.println(count);
    System.out.println("==");
    return count;
}
