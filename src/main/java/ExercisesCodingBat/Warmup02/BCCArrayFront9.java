void main(String[] args) {
    arrayFront9(new int[]{1, 2, 9, 3, 4}); //→ true
    arrayFront9(new int[]{1, 2, 3, 4, 9}); //→ false
    arrayFront9(new int[]{1, 2, 3, 4, 5}); //→ false//
    arrayFront9(new int[]{9, 2, 3});
}

public boolean arrayFront9(int[] nums) {
    boolean result = false;
   if (nums.length <= 3 ) {
       for (int i = 0; i < nums.length; i++) {
           if (nums[i] == 9) {
               result = true;
               break;
           }
       }
   } else {
       for (int i = 0; i < 4; i++) {
           if (nums[i] == 9) {
               result = true;
           }
       }
   }
    System.out.println(result);
    return result;
}

public boolean arrayFront9_2(int[] nums) {
    boolean result = false;
    int limit = nums.length;
    if (limit > 4) limit = 4;

    for (int i = 0; i < limit; i++) {
        if (nums[i] == 9) {
            result = true;
            break;
        }
    }
    return result;
}
