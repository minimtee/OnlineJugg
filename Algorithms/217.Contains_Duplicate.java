/*Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.*/

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length < 1) 
            return false;
        
        Map<Integer,Integer> result = new HashMap<>();
        
        for(int num:nums){
            if(result.containsKey(num)){
                return true;
            }else{
                result.put(num,num);
            }
        }
        
        return false;
    }
}
