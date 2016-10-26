/*
Given an array of integers, every element appears three times except for one. Find that single one.
*/

public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        
        int len = nums.length;
        
        int[] flag = new int[32];
        
        for(int i=0;i<len;i++){
            for(int j=0;j<32;j++){
                flag[j] += ((nums[i]>>j)%2);
            }
        }
        
        for(int i=0;i<32;i++){
            if(flag[i]%3 != 0)
                result+=1<<i;
        }
        
        return result;
    }
}
