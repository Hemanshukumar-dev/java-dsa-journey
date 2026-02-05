//Two Sum
//Brute force(nested loops)
//Check all pairs until target sum is found
class Solution {
    public int[] twoSum(int[] nums, int target) {
       for(int i = 0; i < nums.length; i++){
        for(int j = i + 1; j < nums.length; j++){
            if(nums[i] + nums[j] == target){
                 int[] arr = { i , j};
                 return arr;
            }
        }
     
       }
       int[] arr = {};
       return arr; 
    }
}