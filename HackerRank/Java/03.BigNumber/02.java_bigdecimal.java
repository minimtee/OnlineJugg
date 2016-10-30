/*
Java's BigDecimal class can handle arbitrary-precision signed decimal numbers.
Let's test your knowledge of them!

Given an array, s, of n real number strings, sort them in descending order — but wait, there's more!
Each number must be printed in the exact same format as it was read from stdin, meaning that .1 is printed as .1, and 0.1 is printed as 0.1.
If two numbers represent numerically equivalent values (e.g., .1 = 0.1 ), then they must be listed in the same order as they were received as input).

Complete the code in the unlocked section of the editor below.
You must rearrange array s's elements according to the instructions above.
*/

import java.math.BigDecimal;
import java.util.*;

class Solution{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] s = new String[n];
		for(int i = 0;i < s.length;i++){
			s[i] = scan.next();
		}

		Arrays.sort(s,Collections.reverseOrder(new Comparator<String>(){
			@Override
			public int compare(String s1,String s2){
				BigDecimal a = new BigDecimal(s1);
				BigDecimal b = new BigDecimal(s2);
				return a.comparaTo(b);
			}
		}))

		for(int i = 0;i < n;i++){
			System.out.println(s[i]);
		}


	}
}