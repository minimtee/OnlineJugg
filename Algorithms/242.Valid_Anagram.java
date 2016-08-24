/*
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
*/
public class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s == null && t == null){
            return true;
        }
        
        //String s
        Map<Character,Integer> sMap = new HashMap<>();
        char[] sChars = s.toCharArray();
        int sLen = sChars.length;
        
        for(int i=0;i<sLen;i++){
            if(sMap.containsKey(sChars[i])){
                sMap.put(sChars[i],sMap.get(sChars[i])+1);
            }else{
                sMap.put(sChars[i],1);
            }
        }
        //String t
        Map<Character,Integer> tMap = new HashMap<>();
        char[] tChars = t.toCharArray();
        int tLen = tChars.length;
        
        for(int i=0;i<tLen;i++){
            if(tMap.containsKey(tChars[i])){
                tMap.put(tChars[i],tMap.get(tChars[i])+1);
            }else{
                tMap.put(tChars[i],1);
            }
        }
        //judge
        return sMap.equals(tMap);
    }
}
