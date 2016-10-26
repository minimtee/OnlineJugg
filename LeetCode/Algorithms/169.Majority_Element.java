/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> countMap = new HashMap<Integer,Integer>();
        
        int count = 0;
        
        for(int num :nums){
            if(!countMap.containsKey(num)){
                countMap.put(num,1);
            }else{
                count = countMap.get(num)+1;
                countMap.put(num,count);
            }
            
            if(countMap.get(num)>nums.length/2) return num;
        }
        
        return nums[0];
    }
}
