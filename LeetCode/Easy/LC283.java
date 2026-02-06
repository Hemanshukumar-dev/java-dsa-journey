// move zeros
//brute force
//move each zero to end


class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len - 1; j++){
                if(nums[j] == 0){ int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;}
            }
        }
    }
}