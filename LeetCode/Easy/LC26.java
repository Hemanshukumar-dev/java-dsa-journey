//Remove Duplicates from Sorted Array
//Two pointer
//compare and update.



class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int k = 1;
        int count = 1;
        for(int i = 1; i < len; i++){
            if(nums[i] !=nums[i-1]){
                nums[k] = nums[i];
               k++;
               count++;
            }
        }return count;
    }
}