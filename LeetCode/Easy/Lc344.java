// Reverse String
// Two pointers
// In-place swap
class Solution {
    public void reverseString(char[] s) {
        //setting the left and right indices
        int left = 0;
        int right = s.length - 1;
        //using while loop to make sure that elements gets swapped until the indices reached the middle of array
        while (left < right) {
        //storing element at left index in temp
        char temp = s[left];
        //storing element at right index in left
        s[left] = s[right];
        //storing element at temp in right
        s[right] = temp;
        //moving the left index forward and right index backward so they come towards middle part
            left++;
            right--;
        }
    }
}
