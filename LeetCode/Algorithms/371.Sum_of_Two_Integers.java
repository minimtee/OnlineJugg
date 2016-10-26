//Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
public class Solution {
    public int getSum(int a, int b) {
        if(a ==0) return b;
        
        int x = a^b;
        int c = (a&b)<<1;
        return getSum(c,x);
    }
}
