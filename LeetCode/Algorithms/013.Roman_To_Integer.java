public class Solution {

/*
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
*/

    public int romanToInt(String s) {
        int result = 0;
        
        int len = s.length();
        if(len==0) return result;
        
        char[] romanChars = s.toCharArray();
        
        int sub = getRomanValue(romanChars[0]);
        
        int preValue = sub;
        
    
        for(int i = 1 ; i < len; ++i) {  
            int currentValue = getRomanValue(romanChars[i]);  
            if(currentValue == preValue)   
                sub += currentValue;  
            else if( currentValue < preValue) {  
                result += sub;  
                sub = currentValue;  
            } else {  
                sub = currentValue - sub;  
            }  
            preValue = currentValue;  
        }  
        result += sub;  
        return result;  

    }
    
    private int getRomanValue(char c){
        switch(c){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:return 0;
        }
    }
}
