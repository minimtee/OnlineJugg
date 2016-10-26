/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".
*/

public class Solution {
    public String reverseVowels(String s) {
        
        String vowels = "aeiouAEIOU";
        
        int len = s.length();
        char[] chars = s.toCharArray();
        
        int begin = 0;
        int end   = len-1;
        
        while(begin<end){
            
            while(begin<end && !vowels.contains(chars[begin]+"")) begin++;
            
            while(begin<end && !vowels.contains(chars[end]+"")) end--;
            
            if(begin<end){
                swapChar(chars,begin,end);
                begin++;end--;
            }
            
        }
        
        return new String(chars);
        
    }
    
    private void swapChar(char[] chars,int begin ,int end){
        char temp = chars[begin];
        chars[begin]  = chars[end];
        chars[end]= temp;
    }
}
