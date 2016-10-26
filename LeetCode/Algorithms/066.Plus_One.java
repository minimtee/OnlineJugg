/*
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
*/

public class Solution {
    public int[] plusOne(int[] digits) {
        //进位符
        boolean isCarry = true;
        
        //循环判断进位
        for(int i = digits.length-1;i>=0;i--){
            digits[i] += ((isCarry)?1:0);
            if(digits[i]>=10){
                digits[i]-=10;
                isCarry = true;
            }else{
                isCarry = false;
                break;
            }
        }
        
        //说明isCarry已经传递到了首位
        if(isCarry){
            int[] result = new int[digits.length+1];
            result[0] =1;
            for(int i=1;i<result.length;i++){
                result[i] = digits[i-1];
            }
            return result;
        }else
            return digits;
    }
}
