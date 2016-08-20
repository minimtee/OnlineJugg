/*Reverse digits of an integer.

https://leetcode.com/problems/reverse-integer/

Example1: x = 123, return 321
Example2: x = -123, return -321*/

/*Have you thought about this?
Here are some good questions to ask before coding. 
Bonus points for you if you have already thought through this!

If the integer's last digit is 0, what should the output be?
ie, cases such as 10, 100.

Did you notice that the reversed integer might overflow? 
Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. 
How should you handle such cases?

Assume that your function returns 0 when the reversed integer overflows.

*/

public class Solution
{
    public int reverse(int x)
    {
    	int negative=1;

    	if (x<0)
    	{
			negative=-1;
			x=-x;
    	}

    	long y=x%10;

		while(x/10!=0)
		{
			y*=10;
			x/=10;
			y+=x%10;
		}

		if (negative*y>Integer.MAX_VALUE||negative*y<Integer.MIN_VALUE)
		{
			return 0;	
		}
		else
		{
			return (int) (negative*y);
		}
    }
}