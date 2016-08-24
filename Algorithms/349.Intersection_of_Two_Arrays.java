/*
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.

*/

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        if(nums1==null || nums2==null || nums1.length<1 || nums2.length<1) return new int[0];
        
        Map<Integer,Integer> map1 = new HashMap<>();
        
        int len1 = nums1.length;
        for(int i=0;i<len1;i++){
            if(!map1.containsKey(nums1[i])){
                map1.put(nums1[i],1);
            }
        }
        
        Map<Integer,Integer> map2 = new HashMap<>();
        int len2 = nums2.length;
        
        for(int i=0;i<len2;i++){
            if(!map2.containsKey(nums2[i])){
                map2.put(nums2[i],1);
            }
        }
        
        LinkedList<Integer> resultList = new LinkedList<>();
        
        for(Map.Entry<Integer,Integer> entry1:map1.entrySet()){
            if(map2.containsKey(entry1.getKey())){
                resultList.add(entry1.getKey());
            }
        }
        
        int listLen = resultList.size();
        int[] result = new int[listLen];
        
        for(int i=0;i<listLen;i++){
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}
