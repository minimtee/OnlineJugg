/*

Given s = "hello", return "olleh".

*/

public class Solution {
    public String reverseString(String s) {
        
        int len = s.length();
        
        char[] chars = new char[len];
        
        for(int i=0;i<len;i++){
             chars[i] = s.charAt(len-i-1);
        }
        
        return new String(chars);
    }
}
