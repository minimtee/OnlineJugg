/*
Given an array of integers, every element appears twice except for one. Find that single one.
*/

public class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null || nums.length <1)
            throw new IllegalArgumentException("nums");
        
        int len = nums.length;
            
        for(int i = 1;i<len;i++){
            nums[0] ^= nums[i];
        }
        
        return nums[0];
    }
}
