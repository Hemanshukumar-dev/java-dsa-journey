//Squares of a Sorted Array
//Two pointers
//square the element and compare.




class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int pos = len-1;
        int left = 0;
        int right = len -1;
        int[] arr = new int[len];
        while(left<= right){
           
            if(nums[left] * nums[left] >= nums[right] * nums[right]){
                arr[pos] = nums[left] * nums[left];
                left++;
                pos--;
            }
            else{
                arr[pos] = nums[right] * nums[right];
                right--;
                pos--;
            }
            
        } return arr;
    }
}