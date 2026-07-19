void main(String[] args) {
    arrayCount9(new int[] {1, 2, 9}); // → 1
    arrayCount9(new int[] {1, 9, 9}); //  → 2
    arrayCount9(new int[] {1, 9, 9, 3, 9}); //  → 3
}


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
