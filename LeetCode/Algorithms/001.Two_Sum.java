/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] array = new int[2];
        
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                //remove the duplicated value
                if(i==j) break;
                //sort the valid value and return;
                if(nums[i]+nums[j]==target){
                    if(i<j){
                        array[0] = i;
                        array[1] = j;
                    }else{
                        array[0] = j;
                        array[1] = i;
                    }
                    return array;
                }
            }
        }
        
        return array;
    }
}
